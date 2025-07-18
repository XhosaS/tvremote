package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlg extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlg(Context context, djz djzVar, dlj dljVar, Bundle bundle, ykb ykbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.h = i;
        this.b = context;
        this.c = djzVar;
        this.d = dljVar;
        this.e = bundle;
        this.f = ykbVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            return ((dlg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((dlg) create((dss) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, ykb] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.h != 0) {
            Object obj2 = this.f;
            Object obj3 = this.e;
            ?? r5 = this.d;
            Object obj4 = this.c;
            bcy bcyVar = (bcy) obj3;
            ylf ylfVar = (ylf) obj2;
            dlg dlgVar = new dlg(ylfVar, bcyVar, (dvk) r5, (cdz) obj4, (View) this.b, yihVar, 1);
            dlgVar.g = obj;
            return dlgVar;
        }
        Object obj5 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.d;
        dlj dljVar = (dlj) obj7;
        djz djzVar = (djz) obj6;
        Context context = (Context) obj5;
        dlg dlgVar2 = new dlg(context, djzVar, dljVar, (Bundle) this.e, (ykb) this.f, yihVar, 0);
        dlgVar2.g = obj;
        return dlgVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if (r3.c((android.content.Context) r6, r11, r18) != r0) goto L50;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v5, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ykb] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlg(ylf ylfVar, bcy bcyVar, dvk dvkVar, cdz cdzVar, View view, yih yihVar, int i) {
        super(2, yihVar);
        this.h = i;
        this.f = ylfVar;
        this.e = bcyVar;
        this.d = dvkVar;
        this.c = cdzVar;
        this.b = view;
    }
}
