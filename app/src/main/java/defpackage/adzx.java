package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adzx implements abxf {
    TYPE_UNKNOWN(0),
    TYPE_KP(1),
    TYPE_KP_UNKNOWN(17),
    TYPE_KP_PERSON(18),
    TYPE_KP_MUSIC_ARTIST(289),
    TYPE_KP_QUICK_ANSWER(19),
    TYPE_KP_TIME(305),
    TYPE_KP_TIME_DATE(4881),
    TYPE_KP_SUNRISE_SUNSET(4882),
    TYPE_KP_WHEN_IS(4883),
    TYPE_KP_STATISTICS(306),
    TYPE_KP_QUESTION_ANSWER(307),
    TYPE_KP_ROUTES(308),
    TYPE_KP_CALCULATOR(309),
    TYPE_KP_DICTIONARY(310),
    TYPE_KP_APP(20),
    TYPE_KP_MOVIE_OR_TV(21),
    TYPE_KP_MOVIE(337),
    TYPE_KP_TV(338),
    TYPE_KP_MOVIE_SERIES(339),
    TYPE_KP_VIDEO(22),
    TYPE_KP_IMAGES(23),
    TYPE_KP_MUSIC(24),
    TYPE_KP_MUSIC_ALBUM(385),
    TYPE_KP_SONG(386),
    TYPE_KP_MUSIC_GROUP(387),
    TYPE_KP_EVENT(25),
    TYPE_NO_KP_RESULTS_PAGE(2),
    TYPE_SEARCH_RESULTS_PAGE(33),
    TYPE_SEARCH_RESULTS_PAGE_PERSON(529),
    TYPE_SEARCH_RESULTS_PAGE_MUSIC_ARTIST(530),
    TYPE_SEARCH_RESULTS_PAGE_MUSIC_GROUP(531),
    TYPE_RECOMMENDATION_RESULTS_PAGE(34),
    TYPE_KP_DISABLED_PAGE(35),
    TYPE_APPS_SEARCH_RESULTS_PAGE_KP_DISABLED(561),
    TYPE_YOUTUBE_SEARCH_RESULTS_PAGE_KP_DISABLED(562),
    TYPE_SEARCH_RESULTS_PAGE_KP_DISABLED(563),
    TYPE_FREE_MEDIA(36),
    TYPE_INFO_CARD(3),
    TYPE_WEATHER_CARD(49),
    TYPE_SPORTS_CARD(50),
    TYPE_EDUCATIONAL(4),
    TYPE_HELP(65),
    TYPE_VOICE_ACTION(5),
    TYPE_ACTION_UNKNOWN(81),
    TYPE_ACTION_OPEN_APP(82),
    TYPE_ACTION_SWITCH_INPUT(83),
    TYPE_ACTION_TV_GUIDE(84),
    TYPE_ACTION_TURN_OFF(85),
    TYPE_ACTION_TURN_ON(86),
    TYPE_PUNT(6),
    TYPE_LOCATION_BASED_PUNT(97);

    public final int aa;

    adzx(int i) {
        this.aa = i;
    }

    public static adzx b(int i) {
        if (i == 49) {
            return TYPE_WEATHER_CARD;
        }
        if (i == 50) {
            return TYPE_SPORTS_CARD;
        }
        switch (i) {
            case 0:
                return TYPE_UNKNOWN;
            case 1:
                return TYPE_KP;
            case 2:
                return TYPE_NO_KP_RESULTS_PAGE;
            case 3:
                return TYPE_INFO_CARD;
            case 4:
                return TYPE_EDUCATIONAL;
            case 5:
                return TYPE_VOICE_ACTION;
            case 6:
                return TYPE_PUNT;
            default:
                switch (i) {
                    case 17:
                        return TYPE_KP_UNKNOWN;
                    case 18:
                        return TYPE_KP_PERSON;
                    case 19:
                        return TYPE_KP_QUICK_ANSWER;
                    case 20:
                        return TYPE_KP_APP;
                    case 21:
                        return TYPE_KP_MOVIE_OR_TV;
                    case 22:
                        return TYPE_KP_VIDEO;
                    case 23:
                        return TYPE_KP_IMAGES;
                    case 24:
                        return TYPE_KP_MUSIC;
                    case 25:
                        return TYPE_KP_EVENT;
                    case 65:
                        return TYPE_HELP;
                    case 97:
                        return TYPE_LOCATION_BASED_PUNT;
                    case 289:
                        return TYPE_KP_MUSIC_ARTIST;
                    case 4881:
                        return TYPE_KP_TIME_DATE;
                    case 4882:
                        return TYPE_KP_SUNRISE_SUNSET;
                    case 4883:
                        return TYPE_KP_WHEN_IS;
                    default:
                        switch (i) {
                            case 33:
                                return TYPE_SEARCH_RESULTS_PAGE;
                            case 34:
                                return TYPE_RECOMMENDATION_RESULTS_PAGE;
                            case 35:
                                return TYPE_KP_DISABLED_PAGE;
                            case 36:
                                return TYPE_FREE_MEDIA;
                            default:
                                switch (i) {
                                    case 81:
                                        return TYPE_ACTION_UNKNOWN;
                                    case 82:
                                        return TYPE_ACTION_OPEN_APP;
                                    case 83:
                                        return TYPE_ACTION_SWITCH_INPUT;
                                    case 84:
                                        return TYPE_ACTION_TV_GUIDE;
                                    case 85:
                                        return TYPE_ACTION_TURN_OFF;
                                    case 86:
                                        return TYPE_ACTION_TURN_ON;
                                    default:
                                        switch (i) {
                                            case 305:
                                                return TYPE_KP_TIME;
                                            case 306:
                                                return TYPE_KP_STATISTICS;
                                            case 307:
                                                return TYPE_KP_QUESTION_ANSWER;
                                            case 308:
                                                return TYPE_KP_ROUTES;
                                            case 309:
                                                return TYPE_KP_CALCULATOR;
                                            case 310:
                                                return TYPE_KP_DICTIONARY;
                                            default:
                                                switch (i) {
                                                    case 337:
                                                        return TYPE_KP_MOVIE;
                                                    case 338:
                                                        return TYPE_KP_TV;
                                                    case 339:
                                                        return TYPE_KP_MOVIE_SERIES;
                                                    default:
                                                        switch (i) {
                                                            case 385:
                                                                return TYPE_KP_MUSIC_ALBUM;
                                                            case 386:
                                                                return TYPE_KP_SONG;
                                                            case 387:
                                                                return TYPE_KP_MUSIC_GROUP;
                                                            default:
                                                                switch (i) {
                                                                    case 529:
                                                                        return TYPE_SEARCH_RESULTS_PAGE_PERSON;
                                                                    case 530:
                                                                        return TYPE_SEARCH_RESULTS_PAGE_MUSIC_ARTIST;
                                                                    case 531:
                                                                        return TYPE_SEARCH_RESULTS_PAGE_MUSIC_GROUP;
                                                                    default:
                                                                        switch (i) {
                                                                            case 561:
                                                                                return TYPE_APPS_SEARCH_RESULTS_PAGE_KP_DISABLED;
                                                                            case 562:
                                                                                return TYPE_YOUTUBE_SEARCH_RESULTS_PAGE_KP_DISABLED;
                                                                            case 563:
                                                                                return TYPE_SEARCH_RESULTS_PAGE_KP_DISABLED;
                                                                            default:
                                                                                return null;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.aa;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aa);
    }
}
