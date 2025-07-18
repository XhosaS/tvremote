package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uty extends uug {
    public boolean a;
    public short b;
    private int c;
    private int d;
    private float e;
    private float f;
    private float g;
    private float h;

    public uty() {
    }

    @Override // defpackage.uug
    public final uuh a() {
        if (this.b == 8191) {
            return new utz(this.c, this.d, this.e, this.f, this.g, this.h, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" extraSpaceBeforeKeyLine");
        }
        if ((this.b & 2) == 0) {
            sb.append(" extraSpace");
        }
        if ((this.b & 4) == 0) {
            sb.append(" showTitleWhenExtraSpaceSpecified");
        }
        if ((this.b & 8) == 0) {
            sb.append(" extraSpaceAfterKeyLine");
        }
        if ((this.b & 16) == 0) {
            sb.append(" titleViewUnselectedScale");
        }
        if ((this.b & 32) == 0) {
            sb.append(" titleViewSelectedScale");
        }
        if ((this.b & 64) == 0) {
            sb.append(" titleViewTranslationY");
        }
        if ((this.b & 128) == 0) {
            sb.append(" titleViewCollapsedTranslationY");
        }
        if ((this.b & 256) == 0) {
            sb.append(" titleViewCollapsedScale");
        }
        if ((this.b & 512) == 0) {
            sb.append(" collapsedTranslationY");
        }
        if ((this.b & 1024) == 0) {
            sb.append(" forceExtraSpaceOnGridUnFocused");
        }
        if ((this.b & 2048) == 0) {
            sb.append(" forceExtraSpaceAfterKeyLineOnGridUnFocused");
        }
        if ((this.b & 4096) == 0) {
            sb.append(" avoidOverlappingExtraSpace");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.uug
    public final void b() {
        this.b = (short) (this.b | 512);
    }

    @Override // defpackage.uug
    public final void c(int i) {
        this.d = i;
        this.b = (short) (this.b | 8);
    }

    @Override // defpackage.uug
    public final void d(int i) {
        this.c = i;
        this.b = (short) (this.b | 1);
    }

    @Override // defpackage.uug
    public final void e() {
        this.h = 1.0f;
        this.b = (short) (this.b | 256);
    }

    @Override // defpackage.uug
    public final void f() {
        this.b = (short) (this.b | 128);
    }

    @Override // defpackage.uug
    public final void g(float f) {
        this.f = f;
        this.b = (short) (this.b | 32);
    }

    @Override // defpackage.uug
    public final void h(float f) {
        this.g = f;
        this.b = (short) (this.b | 64);
    }

    @Override // defpackage.uug
    public final void i(float f) {
        this.e = f;
        this.b = (short) (this.b | 16);
    }

    public uty(uuh uuhVar) {
        utz utzVar = (utz) uuhVar;
        this.c = utzVar.a;
        this.d = utzVar.b;
        this.e = utzVar.c;
        this.f = utzVar.d;
        this.g = utzVar.e;
        this.h = utzVar.f;
        this.a = utzVar.g;
        this.b = (short) 8191;
    }
}
