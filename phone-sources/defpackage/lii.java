package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lii implements yfo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lii(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, lfn] */
    @Override // defpackage.yfo, defpackage.yfn
    public final Object b() {
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                rsp rspVarD = rsq.d();
                rspVarD.e = true == r0.cQ() ? 3 : 2;
                return rspVarD.a();
            case 1:
                return this.a;
            case 2:
                ?? r02 = this.a;
                ruj rujVarD = ruk.d();
                rujVarD.b(r02.dr());
                return rujVarD.a();
            case 3:
                ?? r03 = this.a;
                ruj rujVarD2 = rqq.d();
                rujVarD2.d(r03.ca());
                return rujVarD2.c();
            case 4:
                ?? r04 = this.a;
                rte rteVarD = rtf.d();
                rteVarD.b(r04.cS());
                return rteVarD.a();
            case 5:
                ?? r05 = this.a;
                rub rubVarD = ruc.d();
                rubVarD.b = true == r05.cV() ? 3 : 2;
                return rubVarD.a();
            case 6:
                ?? r06 = this.a;
                rub rubVarD2 = rph.d();
                rubVarD2.c(r06.bQ());
                return rubVarD2.b();
            case 7:
                ?? r07 = this.a;
                sds sdsVarD = rsf.d();
                sdsVarD.e(r07.cN());
                return sdsVarD.d();
            case 8:
                return ImmutableSet.of(this.a.b());
            case 9:
                ?? r08 = this.a;
                if (!((tst) r08.b()).g()) {
                    return null;
                }
                return null;
            case 10:
                return false;
            case 11:
                return (rva) this.a.b();
            case 12:
                return 10;
            case 13:
                return this.a;
            case 14:
                return ImmutableList.of(((ush) this.a).a());
            case 15:
                Object obj = this.a;
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator it = ((vvd) obj).c.iterator();
                while (it.hasNext()) {
                    builder.add((ImmutableList.Builder) ((uqk) it.next()).a());
                }
                return builder.build();
            case 16:
                return ImmutableList.of(new ute(this.a, 0));
            case 17:
                return ImmutableList.of((uty) new ute(((vvd) this.a).d, 1), new uty());
            case 18:
                return ImmutableList.of(this.a);
            case 19:
                return ImmutableList.of((ImmutableList) this.a.b());
            default:
                return this.a;
        }
    }
}
