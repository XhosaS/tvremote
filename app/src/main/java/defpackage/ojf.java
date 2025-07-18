package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojf extends omk {
    public yyn a;
    public yyr b;
    private yzo c;
    private yzq d;
    private yzo e;
    private yzq f;
    private yyf g;
    private yyk h;

    public ojf() {
    }

    @Override // defpackage.omk
    public final oml a() {
        yyr yyrVarA;
        yzo yzoVar = this.c;
        if (yzoVar != null) {
            this.d = yzoVar.f();
        } else if (this.d == null) {
            this.d = zcp.b;
        }
        yzo yzoVar2 = this.e;
        if (yzoVar2 != null) {
            this.f = yzoVar2.f();
        } else if (this.f == null) {
            this.f = zcp.b;
        }
        yyf yyfVar = this.g;
        if (yyfVar != null) {
            this.h = yyfVar.f();
        } else if (this.h == null) {
            int i = yyk.e;
            this.h = zcg.b;
        }
        yyn yynVar = this.a;
        if (yynVar == null) {
            if (this.b == null) {
                yyrVarA = zcl.a;
            }
            return new ojg(this.d, this.f, this.h, this.b);
        }
        yyrVarA = yynVar.a(true);
        this.b = yyrVarA;
        return new ojg(this.d, this.f, this.h, this.b);
    }

    @Override // defpackage.omk
    public final yyf b() {
        if (this.g == null) {
            if (this.h == null) {
                int i = yyk.e;
                this.g = new yyf(4);
            } else {
                int i2 = yyk.e;
                yyf yyfVar = new yyf(4);
                this.g = yyfVar;
                yyfVar.h(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.omk
    public final yzo c() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = new yzo();
            } else {
                yzo yzoVar = new yzo();
                this.c = yzoVar;
                yzoVar.i(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.omk
    public final yzo d() {
        if (this.e == null) {
            if (this.f == null) {
                this.e = new yzo();
            } else {
                yzo yzoVar = new yzo();
                this.e = yzoVar;
                yzoVar.i(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    public ojf(oml omlVar) {
        ojg ojgVar = (ojg) omlVar;
        this.d = ojgVar.a;
        this.f = ojgVar.b;
        this.h = ojgVar.c;
        this.b = ojgVar.d;
    }
}
