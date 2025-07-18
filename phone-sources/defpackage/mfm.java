package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfm {
    public volatile boolean a;

    public static void a(mfm mfmVar) {
        if (mfmVar != null) {
            mfmVar.a = true;
        }
    }

    public static boolean b(mfm mfmVar) {
        return mfmVar != null && mfmVar.a;
    }

    public final void c() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
