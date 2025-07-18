package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tsf extends tsb {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public byte c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    @Override // defpackage.tsb
    public final int a() {
        if ((this.c & 2) != 0) {
            return this.e;
        }
        throw new IllegalStateException("Property \"channelCount\" has not been set");
    }

    @Override // defpackage.tsb
    public final tsc b() {
        if (this.c == 31) {
            return new tsg(this.a, this.b, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" samplingRate");
        }
        if ((this.c & 2) == 0) {
            sb.append(" channelCount");
        }
        if ((this.c & 4) == 0) {
            sb.append(" encoding");
        }
        if ((this.c & 8) == 0) {
            sb.append(" isFromMic");
        }
        if ((this.c & 16) == 0) {
            sb.append(" enableFastTranscription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.tsb
    public final void d(int i) {
        this.e = i;
        this.c = (byte) (this.c | 2);
    }

    @Override // defpackage.tsb
    public final void e(int i) {
        this.f = i;
        this.c = (byte) (this.c | 4);
    }

    @Override // defpackage.tsb
    public final void f(boolean z) {
        this.g = z;
        this.c = (byte) (this.c | 8);
    }

    @Override // defpackage.tsb
    public final void g(int i) {
        this.d = i;
        this.c = (byte) (this.c | 1);
    }
}
