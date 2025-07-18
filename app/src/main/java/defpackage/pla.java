package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pla extends plf {
    public Uri a;
    public String b;
    public ple c;
    public int d;
    public yyk e;
    public final yqt f = ypv.a;
    public abuy g;
    public byte h;

    @Override // defpackage.plf
    public final void a(abuy abuyVar) {
        if (abuyVar == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        this.g = abuyVar;
    }

    @Override // defpackage.plf
    public final void b(ple pleVar) {
        if (pleVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.c = pleVar;
    }

    @Override // defpackage.plf
    public final void c(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.e = yykVar;
    }

    @Override // defpackage.plf
    public final void d(int i) {
        this.d = i;
        this.h = (byte) 1;
    }
}
