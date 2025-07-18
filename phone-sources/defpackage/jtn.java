package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtn extends yiz implements yjz {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtn(jto jtoVar, yjv yjvVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.f = i2;
        this.c = jtoVar;
        this.d = yjvVar;
        this.e = "";
        this.b = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((jtn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((jtn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((jtn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yrz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.c;
            return new jtn((jto) obj2, (yjv) this.d, (String) this.e, this.b, yihVar, 0);
        }
        if (i == 1) {
            return new jtn((jto) this.c, this.d, this.b, yihVar, 1);
        }
        Object obj3 = this.d;
        return new jtn((ysx[]) obj3, this.b, (AtomicInteger) this.c, (yrz) this.e, yihVar, 2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, ysn] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Object, ysn] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        int i = this.f;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                jto jtoVar = (jto) this.c;
                ieg iegVarA = ((ldy) jtoVar.b).a();
                iegVarA.getClass();
                if (!iegVarA.m()) {
                    ((tug) jto.a.e().h(tvo.a, "GTVM-SearchQuery").j("com/google/android/apps/googletv/app/presentation/components/searchsuggestions/v2/SearchSuggestionsDataSource$requestSearchSuggestions$1", "invokeSuspend", 54, "SearchSuggestionsDataSource.kt")).s("Unable to request for suggestions as account is not present, hence returning empty list");
                    this.d.a(yhb.a);
                }
                mta mtaVar = jtoVar.e;
                Object obj2 = this.e;
                int i2 = this.b;
                this.a = 1;
                obj = mtaVar.m((String) obj2, i2, this);
                if (obj == yioVar) {
                    return yioVar;
                }
            }
            vun<wkx> vunVar = ((wom) ((iht) obj).a).c;
            vunVar.getClass();
            ?? r0 = this.d;
            ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
            for (wkx wkxVar : vunVar) {
                vvd vvdVar = wtv.g;
                wkxVar.i(vvdVar);
                Object objK = wkxVar.l.k((vub) vvdVar.c);
                if (objK == null) {
                    objK = vvdVar.b;
                } else {
                    vvdVar.c(objK);
                }
                objK.getClass();
                arrayList.add((wtv) objK);
            }
            r0.a(arrayList);
            return ygi.a;
        }
        if (i != 1) {
            yio yioVar2 = yio.a;
            try {
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj3 = this.d;
                    int i3 = this.b;
                    ysx ysxVar = ((ysx[]) obj3)[i3];
                    yvs yvsVar = new yvs(this.e, i3);
                    this.a = 1;
                    if (ysxVar.a(yvsVar, this) == yioVar2) {
                        return yioVar2;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.e.e(null);
                }
                return ygi.a;
            } finally {
                if (((AtomicInteger) this.c).decrementAndGet() == 0) {
                    this.e.e(null);
                }
            }
        }
        yio yioVar3 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            jto jtoVar2 = (jto) this.c;
            ieg iegVarA2 = ((ldy) jtoVar2.b).a();
            iegVarA2.getClass();
            if (!iegVarA2.m()) {
                ((tug) jto.a.e().h(tvo.a, "GTVM-SearchQuery").j("com/google/android/apps/googletv/app/presentation/components/searchsuggestions/v2/SearchSuggestionsDataSource$requestRecentSearches$1", "invokeSuspend", 89, "SearchSuggestionsDataSource.kt")).s("Unable to request for recent searches as account is not present, hence returning empty list");
                this.d.a(yhb.a);
            }
            mta mtaVar2 = jtoVar2.e;
            Object obj4 = this.e;
            int i4 = this.b;
            this.a = 1;
            obj = mtaVar2.n((String) obj4, i4, this);
            if (obj == yioVar3) {
                return yioVar3;
            }
        }
        vun<wkx> vunVar2 = ((wom) ((iht) obj).a).c;
        vunVar2.getClass();
        ?? r02 = this.d;
        ArrayList arrayList2 = new ArrayList(yfm.z(vunVar2, 10));
        for (wkx wkxVar2 : vunVar2) {
            vvd vvdVar2 = wtv.g;
            wkxVar2.i(vvdVar2);
            Object objK2 = wkxVar2.l.k((vub) vvdVar2.c);
            if (objK2 == null) {
                objK2 = vvdVar2.b;
            } else {
                vvdVar2.c(objK2);
            }
            objK2.getClass();
            arrayList2.add((wtv) objK2);
        }
        r02.a(arrayList2);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtn(jto jtoVar, yjv yjvVar, String str, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.f = i2;
        this.c = jtoVar;
        this.d = yjvVar;
        this.e = str;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtn(ysx[] ysxVarArr, int i, AtomicInteger atomicInteger, yrz yrzVar, yih yihVar, int i2) {
        super(2, yihVar);
        this.f = i2;
        this.d = ysxVarArr;
        this.b = i;
        this.c = atomicInteger;
        this.e = yrzVar;
    }
}
