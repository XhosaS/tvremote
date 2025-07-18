package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhh {
    public static final dhh a = new dhh("mceliece348864", 12, 3488, 64, false);
    public static final dhh b = new dhh("mceliece348864f", 12, 3488, 64, true);
    public static final dhh c = new dhh("mceliece460896", 13, 4608, 96, false);
    public static final dhh d = new dhh("mceliece460896f", 13, 4608, 96, true);
    public static final dhh e = new dhh("mceliece6688128", 13, 6688, 128, false);
    public static final dhh f = new dhh("mceliece6688128f", 13, 6688, 128, true);
    public static final dhh g = new dhh("mceliece6960119", 13, 6960, 119, false);
    public static final dhh h = new dhh("mceliece6960119f", 13, 6960, 119, true);
    public static final dhh i = new dhh("mceliece8192128", 13, 8192, 128, false);
    public static final dhh j = new dhh("mceliece8192128f", 13, 8192, 128, true);
    public final String k;
    public final int l;
    public final dhf m;

    private dhh(String str, int i2, int i3, int i4, boolean z) {
        this.k = str;
        this.l = i4;
        this.m = new dhf(i2, i3, i4, z);
    }
}
