package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum pag {
    CHROMECAST_2015_AUDIO("a"),
    CHROMECAST_2015("b"),
    CHROMECAST("c"),
    OEM_AUDIO("d", null),
    OEM_TV("e", null),
    ANDROID_TV("f", null),
    OEM_RECEIVER("g", null),
    OEM_AMPLIFIER("h", null),
    OEM_SET_TOP_BOX("i", null),
    OEM_PRE_AMPLIFIER("j", null),
    GOOGLE_HOME("k"),
    OEM_SOUNDBAR("l", null),
    CHROMECAST_2016("m"),
    GAE_OEM_SPEAKER("n", null),
    JBL_AUTHENTICS_200("n168", null),
    JBL_AUTHENTICS_300("n169", null),
    JBL_AUTHENTICS_500("n170", null),
    GOOGLE_HOME_MINI("o"),
    COCO("r"),
    GOOGLE_HOME_MAX("p"),
    CUBE("q"),
    SD_ASSISTANT("s", null),
    G_DEVICE("t"),
    GOOGLE_NEST_HUB("u"),
    CHROMECAST_2018("v"),
    GOOGLE_NEST_HUB_MAX("w"),
    AUDIO_GROUP(null),
    OTHER(null),
    OTHER_AUDIO(null),
    OTHER_TV(null),
    YBC("ybc"),
    YNM("ynm"),
    YNB("ynb"),
    YNC("ync"),
    YTV("ytv", null),
    XB("xb", null),
    YTB("ytb", null),
    YTC("ytc", null),
    YPF("ypf"),
    YPG("ypg"),
    YPH("yph"),
    YPI("ypi"),
    YPJ("ypj"),
    YNH("ynh"),
    YNN("ynn"),
    YPK("ypk"),
    YNP("ynp"),
    YPL("ypl"),
    YPM("ypm"),
    YPN("ypn");

    public static final yyr Y;
    private final String aa;

    static {
        yyn yynVar = new yyn(4);
        for (pag pagVar : values()) {
            String str = pagVar.aa;
            if (str != null) {
                yynVar.c(str, pagVar);
            }
        }
        Y = yynVar.a(true);
    }

    pag(String str) {
        this.aa = str;
    }

    pag(String str, byte[] bArr) {
        this.aa = str;
    }
}
