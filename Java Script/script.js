var currentTime = document.getElementById('clock1');
var nextRingTime = document.getElementById('clock2');
var textOverClock = document.getElementById('text');
var timeLeftCount = document.getElementById('clock3');

var dayOfWeek = ["Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"];
var breakLessonWeekdays = [490,40,15,40,20,40,20,40,15,40,10,40,30,40,20,40,20,40,10,40,10,40,10,40];
var breakLessonSaturday = [490,40,15,40,15,40,15,40,15,40,15,40];
var setCurrentHours = 0;
var setCurrentMinutes = 0;
var setCurrentSeconds = 0;

var currentTimeDateVar = new Date();
var nextRingTimeDateVar = new Date();
var timeLeftHours;
var timeLeftMinutes;
var timeLeftSeconds;

function timeLeftCalculation(next, current) {
    timeLeftSeconds = Math.floor((next - current) / 1000); // Math.round(3.5), //округлить; Math.ceil(3.1), //округлить вверх; Math.floor(3.9) //округлить вниз
    timeLeftHours = Math.floor(timeLeftSeconds / 60 / 60);
    timeLeftSeconds = timeLeftSeconds - (timeLeftHours * 60 * 60);
    timeLeftMinutes = Math.floor(timeLeftSeconds / 60);
    timeLeftSeconds = timeLeftSeconds - (timeLeftMinutes * 60);
    //alert (timeLeftHours + " : " + timeLeftMinutes + " : " + timeLeftSeconds);
}

function start() {
    currentTimeDateVar = new Date();
    if ((setCurrentHours != 0) || (setCurrentMinutes != 0) || (setCurrentSeconds != 0)) {
        currentTimeDateVar.setHours(setCurrentHours);
        currentTimeDateVar.setMinutes(setCurrentMinutes);
        currentTimeDateVar.setSeconds(setCurrentSeconds);
    }

    nextRingTimeDateVar = new Date();
    nextRingTimeDateVar.setHours(0);
    nextRingTimeDateVar.setMinutes(0);
    nextRingTimeDateVar.setSeconds(0);

    if ((currentTimeDateVar.getDay() == 6) || (currentTimeDateVar.getDay() == 0)) {
        for (let i = 0; i < breakLessonSaturday.length; i++) {
            if (nextRingTimeDateVar <= currentTimeDateVar) {
                nextRingTimeDateVar.setMinutes(nextRingTimeDateVar.getMinutes() + breakLessonSaturday[i]);
                if ((i % 1) > 0) {
                    textOverClock.textContent = "Урок через";
                } else {
                    textOverClock.textContent = "Перемена через";
                }
            } else {
                break;
            }
        }        
    } else {
        for (let i = 0; i < breakLessonWeekdays.length; i++) {
            if (nextRingTimeDateVar <= currentTimeDateVar) {
                nextRingTimeDateVar.setMinutes(nextRingTimeDateVar.getMinutes() + breakLessonWeekdays[i]);
                if ((i % 1) > 0) {
                    textOverClock.textContent = "Урок через";
                } else {
                    textOverClock.textContent = "Перемена через";
                }
            } else {
                break;
            }
        }
    }

    timeLeftCalculation(nextRingTimeDateVar,currentTimeDateVar);

    if ((timeLeftHours != 0) || (timeLeftHours == 0 && timeLeftMinutes == 0 && timeLeftSeconds == 0)) {
        timeLeftCount.textContent = ("");
    } else {
        timeLeftCount.textContent = (timeLeftHours + " : " + timeLeftMinutes + " : " + timeLeftSeconds);
    }

    currentTime.textContent = currentTimeDateVar.getHours().toString() + " : " + currentTimeDateVar.getMinutes().toString() + " : " + currentTimeDateVar.getSeconds().toString();
    nextRingTime.textContent = nextRingTimeDateVar.getHours().toString() + " : " + nextRingTimeDateVar.getMinutes().toString() + " : " + nextRingTimeDateVar.getSeconds().toString();
    //textOverClock.textContent = "Звонок"
}
//alert (dayOfWeek[currentTimeDateVar.getDay()]);
setInterval(start, 1000);