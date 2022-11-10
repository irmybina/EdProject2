package com.example.sfera_ed.people.storage

import com.example.sfera_ed.people.models.People

class PeopleStorage {
    private val subscribersList = arrayListOf(
        People("Alex Dow", "https://static.wikia.nocookie.net/hieloyfuego/images/0/0f/Matt_Smith_como_Daemon_Targaryen_HotD.jpg/revision/latest?cb=20220830123715", false, 1),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 2),
        People("John Raw", "https://startefacts.com/upload//upload/news/317507603735.jpg", false, 3),
        People("John Raw", "https://i.insider.com/63565f39390dfe00196d978e?width=700", false, 4),
        People("John Raw", "https://i.pinimg.com/originals/f3/b2/b0/f3b2b015270ad22cc3feddaff99b888b.jpg", false, 5),
        People("John Raw", "https://www.nastroy.net/pic/images/202008/265310-1596968235.jpg", false, 6),
        People("John Raw", "https://cdn.kanobu.ru/articles/pics/2d97e89f-f7a2-4dbd-949e-36ec926ec2ed.webp", false, 7),
        People("John Raw", "https://img.gazeta.ru/files3/435/7823435/1-pic4_zoom-1500x1500-42818.jpg", false, 8),
        People("John Raw", "https://static.wikia.nocookie.net/gameofthrones/images/f/f4/%D0%A1%D0%B5%D1%80%D1%81%D0%B5%D1%8F_8x04.jpg/revision/latest?cb=20190512124726&path-prefix=ru", false, 9),
        People("John Raw", "https://static.kinoafisha.info/k/articles/1200/upload/articles/529431095055.jpg", false, 10),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 11),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 12),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 13),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 14),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 15),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 16),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 17),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 18),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 19),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 20),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 21),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 22),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 23),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 24),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 25),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 26),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 27),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 28),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 29),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 30),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 31),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 32),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 33),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 34),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 35),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 36),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 37),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 38),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 39),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg", false, 40)
    )

    private val subscriptionsList = arrayListOf(
        People("Ronald Jeremy", "https://img.freepik.com/free-photo/portrait-of-handsome-young-man-with-crossed-arms_176420-15569.jpg?w=2000", false, 1),
        People("Sam Coin", "https://img.freepik.com/free-photo/portrait-of-handsome-young-man-with-crossed-arms_176420-15569.jpg?w=2000", false, 2),
        People("John Raw", "https://startefacts.com/upload//upload/news/317507603735.jpg", false, 3),
        People("John Raw", "https://i.insider.com/63565f39390dfe00196d978e?width=700", false, 4),
        People("John Raw", "https://i.pinimg.com/originals/f3/b2/b0/f3b2b015270ad22cc3feddaff99b888b.jpg", false, 5),
        People("John Raw", "https://www.nastroy.net/pic/images/202008/265310-1596968235.jpg", false, 6),
        People("John Raw", "https://cdn.kanobu.ru/articles/pics/2d97e89f-f7a2-4dbd-949e-36ec926ec2ed.webp", false, 7),
    )



    fun getSubscribers() : ArrayList<People>{
        return subscribersList
    }

    fun getSubscriptions() : ArrayList<People>{
        return subscriptionsList
    }

}