package ru.netology.data

class PostSource (
    // тип источника
    /*  vk — запись создана через основной интерфейс сайта (http://vk.com/);
        widget — запись создана через виджет на стороннем сайте;
        api — запись создана приложением через API;
        rss— запись создана посредством импорта RSS-ленты со стороннего сайта;
        sms — запись создана посредством отправки SMS-сообщения на специальный номер.*/
    val type: String,
    /*  название платформы, если оно доступно. Возможные значения:
        android;
        iphone;
        wphone.*/
    val platform: String,
    /*  тип действия (только для type = vk или widget). Возможные значения:
        profileActivity — изменение статуса под именем пользователя (для type = vk);
        profilePhoto — изменение профильной фотографии пользователя (для type = vk);
        comments — виджет комментариев (для type = widget);
        like — виджет «Мне нравится» (для type = widget);
        poll — виджет опросов (для type = widget);*/
    data: String,
    //    URL ресурса, с которого была опубликована запись
    val url: String
){
    var data = data
        set (value) {
            field = when {
                type == "vk" && value == "profileActivity" -> value
                type == "vk" && value == "profilePhoto" -> value
                type == "widget" && value == "comments" -> value
                type == "widget" && value == "like" -> value
                type == "widget" && value == "poll" -> value
                else -> return
            }
        }
}
