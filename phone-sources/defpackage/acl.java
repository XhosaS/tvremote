package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acl extends bko implements bxh, byl {
    public static final acj a = new acj();
    public acm b;
    public uv c;
    public kw d;

    public acl(acm acmVar, kw kwVar, uv uvVar) {
        this.b = acmVar;
        this.d = kwVar;
        this.c = uvVar;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(j);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new zn(bwjVarU, 5));
    }

    @Override // defpackage.bxj
    public final /* synthetic */ Object bY(kw kwVar) {
        return fh.ab(this, kwVar);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }

    @Override // defpackage.bxh
    public final bxg i() {
        yfw yfwVar = new yfw(buk.a, this);
        kw kwVar = (kw) yfwVar.a;
        bxk bxkVar = new bxk(kwVar);
        Object obj = yfwVar.b;
        if (kwVar != bxkVar.b) {
            bty.c("Check failed.");
        }
        bxkVar.a.b(obj);
        return bxkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(defpackage.aci r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = defpackage.a.r(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3e
            r0 = 6
            boolean r0 = defpackage.a.r(r6, r0)
            if (r0 == 0) goto L11
            goto L3e
        L11:
            r0 = 3
            boolean r0 = defpackage.a.r(r6, r0)
            if (r0 != 0) goto L37
            r0 = 4
            boolean r0 = defpackage.a.r(r6, r0)
            if (r0 == 0) goto L20
            goto L37
        L20:
            boolean r0 = defpackage.a.r(r6, r2)
            if (r0 != 0) goto L44
            r0 = 2
            boolean r0 = defpackage.a.r(r6, r0)
            if (r0 == 0) goto L2e
            goto L44
        L2e:
            defpackage.fh.u()
            yfs r5 = new yfs
            r5.<init>()
            throw r5
        L37:
            uv r0 = r4.c
            uv r3 = defpackage.uv.a
            if (r0 != r3) goto L44
            goto L5c
        L3e:
            uv r0 = r4.c
            uv r3 = defpackage.uv.b
            if (r0 == r3) goto L5c
        L44:
            boolean r6 = r4.m(r6)
            if (r6 == 0) goto L57
            int r5 = r5.b
            acm r6 = r4.b
            int r6 = r6.b()
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L5c
            return r2
        L57:
            int r5 = r5.a
            if (r5 <= 0) goto L5c
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acl.l(aci, int):boolean");
    }

    public final boolean m(int i) {
        if (a.r(i, 1)) {
            return false;
        }
        if (a.r(i, 2)) {
            return true;
        }
        if (a.r(i, 5)) {
            return false;
        }
        if (a.r(i, 6)) {
            return true;
        }
        if (a.r(i, 3)) {
            int iOrdinal = fh.M(this).ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new yfu();
        }
        if (!a.r(i, 4)) {
            fh.u();
            throw new yfs();
        }
        int iOrdinal2 = fh.M(this).ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new yfu();
    }
}
