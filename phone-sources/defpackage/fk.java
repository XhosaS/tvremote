package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public fk(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.b = view;
        this.a = i;
        this.c = bottomSheetBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [go, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ecw, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((gt) this.c).f(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.b));
                return;
            case 1:
                int i = this.a;
                gt gtVar = (gt) this.b;
                String str = (String) gtVar.a.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                bhi bhiVar = (bhi) gtVar.d.get(str);
                Object obj = bhiVar != null ? bhiVar.b : null;
                Object obj2 = ((cb) this.c).a;
                if (obj == null) {
                    gtVar.f.remove(str);
                    gtVar.e.put(str, obj2);
                    return;
                } else {
                    ?? r2 = bhiVar.b;
                    if (gtVar.c.remove(str)) {
                        r2.a(obj2);
                        return;
                    }
                    return;
                }
            case 2:
                ((hy) this.b).d(this.a, this.c);
                return;
            case 3:
                Iterator it = ((CopyOnWriteArraySet) this.c).iterator();
                while (it.hasNext()) {
                    ecy ecyVar = (ecy) it.next();
                    if (!ecyVar.c) {
                        int i2 = this.a;
                        if (i2 != -1) {
                            ecyVar.d.j(i2);
                        }
                        ?? r4 = this.b;
                        ecyVar.b = true;
                        r4.a(ecyVar.a);
                    }
                }
                return;
            case 4:
                Pair pair = (Pair) this.b;
                ((ejs) this.c).a.j.db(((Integer) pair.first).intValue(), (evz) pair.second, this.a);
                return;
            case 5:
                this.c.db(0, (evz) ((eph) this.b).c, this.a);
                return;
            case 6:
                Context context = (Context) this.b;
                jwq.U(context, context.getResources().getString(this.a, this.c), 1);
                return;
            case 7:
                final nnr nnrVar = (nnr) this.b;
                nor norVar = nnrVar.i;
                if (norVar == null) {
                    return;
                }
                final int i3 = this.a;
                final uco ucoVar = (uco) this.c;
                norVar.a().q(new onv() { // from class: nnq
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
                    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
                    @Override // defpackage.onv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void e(java.lang.Object r6) {
                        /*
                            r5 = this;
                            java.lang.Boolean r6 = (java.lang.Boolean) r6
                            boolean r6 = r6.booleanValue()
                            if (r6 != 0) goto La
                            goto La7
                        La:
                            uco r6 = r2
                            nnr r0 = r1
                            uco r1 = defpackage.uco.a
                            vtw r6 = r1.n(r6)
                            vuc r1 = r6.b
                            boolean r1 = r1.A()
                            if (r1 != 0) goto L1f
                            r6.u()
                        L1f:
                            java.lang.String r1 = r0.g
                            vuc r2 = r6.b
                            r3 = r2
                            uco r3 = (defpackage.uco) r3
                            r1.getClass()
                            int r4 = r3.b
                            r4 = r4 | 16384(0x4000, float:2.2959E-41)
                            r3.b = r4
                            r3.f = r1
                            boolean r2 = r2.A()
                            if (r2 != 0) goto L3a
                            r6.u()
                        L3a:
                            vuc r2 = r6.b
                            uco r2 = (defpackage.uco) r2
                            r1.getClass()
                            int r3 = r2.b
                            r4 = 32768(0x8000, float:4.5918E-41)
                            r3 = r3 | r4
                            r2.b = r3
                            r2.g = r1
                            java.lang.Long r1 = r0.h
                            if (r1 == 0) goto L6c
                            long r1 = r1.longValue()
                            int r1 = (int) r1
                            vuc r2 = r6.b
                            boolean r2 = r2.A()
                            if (r2 != 0) goto L5f
                            r6.u()
                        L5f:
                            vuc r2 = r6.b
                            uco r2 = (defpackage.uco) r2
                            int r3 = r2.b
                            r4 = 65536(0x10000, float:9.1835E-41)
                            r3 = r3 | r4
                            r2.b = r3
                            r2.h = r1
                        L6c:
                            vuc r6 = r6.r()
                            uco r6 = (defpackage.uco) r6
                            int r1 = r0.j
                            int r2 = r1 + (-1)
                            r3 = 0
                            if (r1 == 0) goto La8
                            int r1 = r3
                            if (r2 == 0) goto L8d
                            r4 = 1
                            if (r2 == r4) goto L81
                            goto L9a
                        L81:
                            int r1 = r1 + (-1)
                            ndu r2 = new ndu
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                            r2.<init>(r1, r6, r4, r3)
                            goto L99
                        L8d:
                            int r1 = r1 + (-1)
                            ndu r2 = new ndu
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                            r4 = 2
                            r2.<init>(r1, r6, r4, r3)
                        L99:
                            r3 = r2
                        L9a:
                            defpackage.nsf.e()
                            defpackage.ocv.aF(r3)
                            pkg r6 = r0.k
                            if (r6 == 0) goto La7
                            r6.l(r3)
                        La7:
                            return
                        La8:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnq.e(java.lang.Object):void");
                    }
                });
                return;
            case 8:
                Object obj3 = this.c;
                Map map = ((noo) obj3).d;
                int i4 = this.a;
                Object obj4 = this.b;
                synchronized (map) {
                    ((noo) obj3).n((fur) obj4, i4);
                }
                return;
            case 9:
                qwg qwgVar = (qwg) this.b;
                qwn qwnVar = qwgVar.a;
                qwo qwoVar = qwnVar.b;
                ImmutableList immutableListE = qwoVar.e();
                tst tstVar = qwnVar.e.a;
                Object obj5 = this.c;
                int i5 = this.a;
                Object objG = qwg.g(immutableListE, obj5, i5);
                if (qwgVar.a(objG, obj5)) {
                    return;
                }
                qwgVar.c(i5);
                ril rilVar = qwnVar.g;
                int i6 = i5 == 3 ? 40 : 39;
                vtw vtwVarM = wds.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                wds wdsVar = (wds) vucVar;
                wdsVar.d = 8;
                wdsVar.b |= 2;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                wds wdsVar2 = (wds) vucVar2;
                wdsVar2.f = 10;
                wdsVar2.b |= 32;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                vuc vucVar3 = vtwVarM.b;
                wds wdsVar3 = (wds) vucVar3;
                wdsVar3.e = 3;
                wdsVar3.b |= 8;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                wds wdsVar4 = (wds) vtwVarM.b;
                wdsVar4.c = i6 - 1;
                wdsVar4.b |= 1;
                rilVar.a(obj5, (wds) vtwVarM.r());
                qwoVar.f(objG);
                return;
            case 10:
                qwg qwgVar2 = (qwg) this.b;
                qwgVar2.c(this.a);
                ((rfc) this.c).f.onClick(qwgVar2.b);
                return;
            case 11:
                LicenseActivity.$r8$lambda$E_2H7zYGR83Q8kZwDeH_WtL2gms((LicenseActivity) this.c, this.a, (ScrollView) this.b);
                return;
            default:
                ((BottomSheetBehavior) this.c).S((View) this.b, this.a, false);
                return;
        }
    }

    public /* synthetic */ fk(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ fk(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ fk(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }

    public /* synthetic */ fk(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
