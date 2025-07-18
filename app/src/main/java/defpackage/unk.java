package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class unk {
    public final String a;
    public final unl b;
    public final vrf c;
    public final Object d;
    public final wuw e;
    public List f;
    private final zyd g;
    private final uig h;
    private final zwv i;
    private final vrf j;
    private final int k;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public unk(defpackage.unl r4, defpackage.uig r5, defpackage.zyd r6, boolean r7, java.lang.String r8) {
        /*
            r3 = this;
            r3.<init>()
            vrf r0 = new vrf
            unh r1 = new unh
            r1.<init>(r3)
            zwk r2 = defpackage.zwk.a
            r0.<init>(r1, r2)
            r3.j = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f = r0
            r3.b = r4
            r3.h = r5
            r3.g = r6
            java.lang.String r5 = r4.f()
            r3.a = r5
            vrf r5 = new vrf
            zvh r4 = r4.a()
            r5.<init>(r4, r2)
            r3.c = r5
            zwv r4 = new zwv
            r4.<init>()
            r3.i = r4
            int r4 = r8.hashCode()
            switch(r4) {
                case -1206111217: goto L63;
                case -902467928: goto L59;
                case 3355087: goto L4f;
                case 914473886: goto L45;
                default: goto L44;
            }
        L44:
            goto L6d
        L45:
            java.lang.String r4 = "singleproc"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L6d
            r4 = 3
            goto L6e
        L4f:
            java.lang.String r4 = "mmap"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L6d
            r4 = 6
            goto L6e
        L59:
            java.lang.String r4 = "signal"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L6d
            r4 = 5
            goto L6e
        L63:
            java.lang.String r4 = "multiproc"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L6d
            r4 = 4
            goto L6e
        L6d:
            r4 = 2
        L6e:
            r3.k = r4
            if (r7 == 0) goto L7a
            wuv r4 = new wuv
            r4.<init>()
            r3.e = r4
            goto L81
        L7a:
            wuu r4 = new wuu
            r4.<init>()
            r3.e = r4
        L81:
            und r4 = new und
            r4.<init>()
            r3.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unk.<init>(unl, uig, zyd, boolean, java.lang.String):void");
    }

    public final zyd a(final yqi yqiVar, final Executor executor) {
        final zvi zviVarC = wyo.c(new zvi() { // from class: una
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxn.h(yqiVar.apply(obj));
            }
        });
        yrn yrnVarC = yrn.c(yps.a);
        wuw wuwVar = this.e;
        String str = this.a;
        wvx wvxVarB = wuwVar.b("Update ".concat(String.valueOf(str)));
        try {
            final zyd zydVarB = this.j.b();
            zwv zwvVar = this.i;
            zvh zvhVar = new zvh() { // from class: unb
                @Override // defpackage.zvh
                public final zyd a() {
                    return zydVarB;
                }
            };
            zwk zwkVar = zwk.a;
            zwvVar.b(zvhVar, zwkVar);
            zyd zydVarB2 = zwvVar.b(wyo.b(new zvh() { // from class: unc
                @Override // defpackage.zvh
                public final zyd a() {
                    final unk unkVar = this.a;
                    final zvi zviVar = zviVarC;
                    final Executor executor2 = executor;
                    return zuz.h(zydVarB, wyo.c(new zvi() { // from class: une
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) {
                            return unkVar.b.h(zviVar, executor2, null);
                        }
                    }), zwk.a);
                }
            }), zwkVar);
            zxn.r(zydVarB2, zydVarB);
            uig uigVar = this.h;
            uigVar.c(4, str, this.k, zydVarB2, yrnVarC);
            zxn.i(this.g);
            uigVar.b();
            zyd zydVarA = uno.a(zydVarB2);
            wvxVarB.a(zydVarA);
            wvxVarB.close();
            return zydVarA;
        } finally {
        }
    }

    public final void b(zvi zviVar) {
        synchronized (this.d) {
            this.f.add(zviVar);
        }
    }

    public final zyd c() {
        zyd zydVarH;
        wuw wuwVar = this.e;
        wuwVar.a();
        yrn yrnVarC = yrn.c(yps.a);
        vrf vrfVar = this.j;
        if (vrfVar.d.isDone()) {
            zydVarH = this.b.i(null);
        } else {
            wvx wvxVarB = wuwVar.b("Get ".concat(String.valueOf(this.a)));
            try {
                zydVarH = zuz.h(vrfVar.b(), wyo.c(new zvi() { // from class: unf
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return this.a.b.i(null);
                    }
                }), zwk.a);
                wvxVarB.a(zydVarH);
                wvxVarB.close();
            } finally {
            }
        }
        zyd zydVar = zydVarH;
        uig uigVar = this.h;
        uigVar.c(3, this.a, this.k, zydVar, yrnVarC);
        zxn.i(this.g);
        uigVar.a();
        return zxn.i(zydVar);
    }
}
