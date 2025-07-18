package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfl implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wfl(unc uncVar, slo sloVar, int i) {
        this.c = i;
        this.b = uncVar;
        this.a = sloVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        switch (this.c) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ufw] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.c) {
            case 0:
                wfo wfoVar = (wfo) obj;
                Function function = wfoVar.l == 2 ? ((wfn) this.b).c : ((wfm) this.a).b;
                if (function != null) {
                    return (wfv) function.apply(wfoVar);
                }
                return null;
            case 1:
                Object obj2 = this.a;
                slo sloVar = (slo) obj2;
                Uri uri = sloVar.a;
                sij.s(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
                String strE = sij.E(uri.getLastPathSegment());
                int iLastIndexOf = strE.lastIndexOf(46);
                String strSubstring = iLastIndexOf == -1 ? "" : strE.substring(iLastIndexOf + 1);
                Object obj3 = this.b;
                sij.s(strSubstring.equals("pb"), "Uri extension must be .pb: %s", uri);
                sij.o(sloVar.b != null, "Proto schema cannot be null");
                sij.o(sloVar.c != null, "Handler cannot be null");
                String strA = sloVar.e.a();
                unc uncVar = (unc) obj3;
                sme smeVar = (sme) uncVar.d.get(strA);
                sij.s(smeVar != 0, "No XDataStoreVariantFactory registered for ID %s", strA);
                String strE2 = sij.E(uri.getLastPathSegment());
                int iLastIndexOf2 = strE2.lastIndexOf(46);
                if (iLastIndexOf2 != -1) {
                    strE2 = strE2.substring(0, iLastIndexOf2);
                }
                uhp uhpVarJ = ufn.j(sfy.C(uri), uncVar.b, ugk.a);
                ?? r3 = uncVar.f;
                smd smdVarB = smeVar.b(sloVar, strE2, r3, (aafi) uncVar.c);
                smeVar.a();
                smc smcVar = new smc(smdVarB, uhpVarJ);
                ImmutableList immutableList = sloVar.d;
                if (!immutableList.isEmpty()) {
                    smcVar.c(new slm(immutableList, r3));
                }
                return Pair.create(smcVar, obj2);
            case 2:
                wfo wfoVar2 = (wfo) obj;
                Function function2 = wfoVar2.l == 2 ? ((wfn) this.b).d : ((wfm) this.a).c;
                if (function2 != null) {
                    return (Double) function2.apply(wfoVar2);
                }
                return null;
            case 3:
                wfo wfoVar3 = (wfo) obj;
                Function function3 = wfoVar3.l == 2 ? ((wfn) this.b).e : ((wfm) this.a).e;
                return Double.valueOf(function3 != null ? ((Double) function3.apply(wfoVar3)).doubleValue() : 1.0d);
            case 4:
                wfo wfoVar4 = (wfo) obj;
                Function function4 = wfoVar4.l == 2 ? ((wfn) this.b).f : ((wfm) this.a).f;
                if (function4 != null) {
                    return (wfn) function4.apply(wfoVar4);
                }
                return null;
            case 5:
                wfo wfoVar5 = (wfo) obj;
                Function function5 = wfoVar5.l == 2 ? ((wfn) this.b).g : ((wfm) this.a).g;
                if (function5 != null) {
                    return (wfn) function5.apply(wfoVar5);
                }
                return null;
            case 6:
                wfo wfoVar6 = (wfo) obj;
                Function function6 = wfoVar6.l == 2 ? ((wfn) this.b).h : ((wfm) this.a).h;
                if (function6 != null) {
                    return (wfj) function6.apply(wfoVar6);
                }
                return null;
            case 7:
                wfo wfoVar7 = (wfo) obj;
                Function function7 = wfoVar7.l == 2 ? ((wfn) this.b).i : ((wfm) this.a).i;
                if (function7 != null) {
                    return (wfq) function7.apply(wfoVar7);
                }
                return null;
            default:
                wfo wfoVar8 = (wfo) obj;
                Function function8 = wfoVar8.l == 2 ? ((wfn) this.b).j : ((wfm) this.a).j;
                if (function8 != null) {
                    return (Double) function8.apply(wfoVar8);
                }
                return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ wfl(wfm wfmVar, wfn wfnVar, int i) {
        this.c = i;
        this.a = wfmVar;
        this.b = wfnVar;
    }
}
