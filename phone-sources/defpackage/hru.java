package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hru {
    public static final hru b;
    public static final hru c;
    public static final hru d;
    public static final hru e;
    public static final hru f;
    public static final hlk g;
    static final boolean h;

    static {
        int i = hro.a;
        int i2 = hrp.a;
        b = new hrs();
        c = new hrq();
        hrr hrrVar = new hrr();
        d = hrrVar;
        e = new hrt();
        f = hrrVar;
        g = new hlk("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", hrrVar, hlk.a);
        h = true;
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int b(int i, int i2, int i3, int i4);
}
