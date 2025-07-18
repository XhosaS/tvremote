package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssj implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ssj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Double) ((ssk) this.a).c().get((ssd) obj);
            case 1:
                sik sikVar = (sik) this.a;
                return new rza(sikVar.r(), sikVar.q());
            case 2:
                wcq wcqVar = (wcq) this.a;
                return new wfq(wcqVar.g(), wcqVar.f());
            case 3:
                boolean z = ((wfo) obj).b;
                wcq wcqVar2 = (wcq) this.a;
                return z ? wcqVar2.o() : wcqVar2.q();
            case 4:
                wcq wcqVar3 = (wcq) this.a;
                return new wfq(wcqVar3.g(), wcqVar3.f());
            case 5:
                wcq wcqVar4 = (wcq) this.a;
                return new wfq(wcqVar4.m(), wcqVar4.l());
            case 6:
                wcq wcqVar5 = (wcq) this.a;
                return new wfq(wcqVar5.s(), wcqVar5.r());
            case 7:
                wcq wcqVar6 = (wcq) this.a;
                return new wfq(wcqVar6.k(), wcqVar6.j());
            case 8:
                return ((wcq) this.a).k();
            case 9:
                return ((wcq) this.a).f();
            case 10:
                wcq wcqVar7 = (wcq) this.a;
                return new wfq(wcqVar7.k(), wcqVar7.j());
            case 11:
                return ((wcq) this.a).m();
            case 12:
                return ((wcq) this.a).h();
            case 13:
                return ((wcq) this.a).s();
            case 14:
                return ((wcq) this.a).h();
            case 15:
                return ((wcq) this.a).g();
            case 16:
                return ((wcq) this.a).e();
            case 17:
                return ((wcq) this.a).l();
            case 18:
                return ((wcq) this.a).j();
            case 19:
                wcq wcqVar8 = (wcq) this.a;
                return new wfq(wcqVar8.s(), wcqVar8.r());
            default:
                wcq wcqVar9 = (wcq) this.a;
                return new wfq(wcqVar9.m(), wcqVar9.l());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
