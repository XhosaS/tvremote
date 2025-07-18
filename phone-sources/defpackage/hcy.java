package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcy implements hct, hdb {
    private final boolean b;
    private final hbv c;
    private final hds d;
    private boolean e;
    private final Path a = new Path();
    private final hfw f = new hfw((byte[]) null);

    public hcy(hbv hbvVar, hfk hfkVar, hfg hfgVar) {
        this.b = hfgVar.b;
        this.c = hbvVar;
        hds hdsVarA = hfgVar.a.a();
        this.d = hdsVarA;
        hfkVar.i(hdsVarA);
        hdsVarA.h(this);
    }

    @Override // defpackage.hdb
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // defpackage.hcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r7 >= r1) goto L36
            java.lang.Object r1 = r6.get(r7)
            hcj r1 = (defpackage.hcj) r1
            boolean r2 = r1 instanceof defpackage.hda
            if (r2 == 0) goto L23
            r2 = r1
            hda r2 = (defpackage.hda) r2
            int r3 = r2.e
            r4 = 1
            if (r3 != r4) goto L23
            hfw r1 = r5.f
            r1.d(r2)
            r2.a(r5)
            goto L33
        L23:
            boolean r2 = r1 instanceof defpackage.hcx
            if (r2 == 0) goto L33
            if (r0 != 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L2e:
            hcx r1 = (defpackage.hcx) r1
            r0.add(r1)
        L33:
            int r7 = r7 + 1
            goto L2
        L36:
            hds r6 = r5.d
            r6.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcy.f(java.util.List, java.util.List):void");
    }

    @Override // defpackage.hcj
    public final String g() {
        throw null;
    }

    @Override // defpackage.hct
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) this.d.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.e(path);
        this.e = true;
        return path;
    }
}
