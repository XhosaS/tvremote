package defpackage;

import android.content.Context;
import android.database.Cursor;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lkd implements idy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lkd(Context context, idf idfVar, kwy kwyVar, int i) {
        this.d = i;
        this.b = context;
        this.c = idfVar;
        this.a = kwyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mem] */
    @Override // defpackage.idy
    public final void c(Object obj) {
        int i = this.d;
        int i2 = 3;
        if (i == 0) {
            ieg iegVar = (ieg) obj;
            boolean zM = iegVar.m();
            Object obj2 = this.a;
            if (!zM) {
                ((lkm) obj2).E.e(2, iegVar.i());
                return;
            } else {
                mjo.e(this.b, new ldj(obj2, this.c, i2), ((lkm) obj2).b);
                return;
            }
        }
        if (i == 1) {
            Throwable th = (Throwable) obj;
            jwq.U((Context) this.b, this.c.b(new llt(((kwy) this.a).f(th, true), -1, th, false, false, trk.a)), 1);
            return;
        }
        if (i == 2) {
            ieg iegVar2 = (ieg) obj;
            boolean zM2 = iegVar2.m();
            Object obj3 = this.b;
            if (zM2) {
                Object obj4 = this.a;
                lkm lkmVar = (lkm) obj3;
                lkmVar.f.c(3);
                lkmVar.j((zuw) iegVar2.g(), (Locale) obj4);
                return;
            }
            Object obj5 = this.c;
            lkm lkmVar2 = (lkm) obj3;
            lkmVar2.f.d(3, false);
            Throwable thI = iegVar2.i();
            krd.d("Error loading video streams [request=" + ((String) obj5) + "]", thI);
            lkmVar2.E.e(1, thI);
            return;
        }
        if (i != 3) {
            ieg iegVar3 = (ieg) obj;
            boolean zM3 = iegVar3.m();
            Object obj6 = this.b;
            if (zM3) {
                Object obj7 = this.a;
                lli lliVar = (lli) obj6;
                lliVar.a.c(3);
                lliVar.d((zuw) iegVar3.g(), (Locale) obj7);
                return;
            }
            Object obj8 = this.c;
            lli lliVar2 = (lli) obj6;
            lliVar2.a.d(3, false);
            Throwable thI2 = iegVar3.i();
            krd.d("Error loading video streams [request=" + ((String) obj8) + "]", thI2);
            lliVar2.i.e(1, thI2);
            return;
        }
        lki lkiVar = (lki) obj;
        ieg iegVar4 = lkiVar.b;
        boolean zK = iegVar4.k();
        Object obj9 = this.c;
        if (zK) {
            ((lkm) obj9).E.e(2, iegVar4.i());
            return;
        }
        ieg iegVar5 = lkiVar.a;
        if (!iegVar5.m()) {
            lkm lkmVar3 = (lkm) obj9;
            lkmVar3.f.d(4, false);
            lkmVar3.c();
        } else {
            ?? r1 = this.a;
            Object obj10 = this.b;
            lkm lkmVar4 = (lkm) obj9;
            lkmVar4.f.c(4);
            lkmVar4.d((Context) obj10, (Cursor) iegVar5.g(), (kst) iegVar4.g(), r1);
        }
    }

    public /* synthetic */ lkd(Object obj, Locale locale, String str, int i) {
        this.d = i;
        this.b = obj;
        this.a = locale;
        this.c = str;
    }

    public /* synthetic */ lkd(lkm lkmVar, Context context, mem memVar, int i) {
        this.d = i;
        this.c = lkmVar;
        this.b = context;
        this.a = memVar;
    }

    public /* synthetic */ lkd(lkm lkmVar, idy idyVar, ksn ksnVar, int i) {
        this.d = i;
        this.a = lkmVar;
        this.b = idyVar;
        this.c = ksnVar;
    }
}
