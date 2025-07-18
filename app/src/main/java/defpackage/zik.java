package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zik {
    public final int a;
    public final zfm b;

    protected zik(zfm zfmVar, int i) {
        if (zfmVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.b(i, "invalid index: "));
        }
        this.a = i;
        this.b = zfmVar;
    }

    public abstract void a(zil zilVar, Object obj);
}
