package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfb implements Function {
    public final /* synthetic */ wcq a;
    private final /* synthetic */ int b;

    public /* synthetic */ wfb(wcq wcqVar, int i) {
        this.b = i;
        this.a = wcqVar;
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
                wfo wfoVar = (wfo) obj;
                int i = wfoVar.j;
                return (Double) wfn.f(new wff(this.a, 5)).apply(wfoVar);
            case 1:
                return this.a.r();
            case 2:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 3:
                return this.a.m();
            case 4:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 5:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 6:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 7:
                int i2 = ((wfo) obj).k;
                wcq wcqVar = this.a;
                return new wfq(wcqVar.s(), wcqVar.r(), null);
            case 8:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 9:
                int i3 = ((wfo) obj).k;
                wcq wcqVar2 = this.a;
                return new wfq(wcqVar2.m(), wcqVar2.l(), null);
            case 10:
                int i4 = ((wfo) obj).k;
                return this.a.f();
            case 11:
                return this.a.k();
            case 12:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 13:
                int i5 = ((wfo) obj).k;
                wcq wcqVar3 = this.a;
                return new wfq(wcqVar3.g(), wcqVar3.f(), null);
            case 14:
                return wcq.E((wfh) this.a, (wfo) obj);
            case 15:
                return wcq.E((wfh) this.a, (wfo) obj);
            case 16:
                int i6 = ((wfo) obj).k;
                return this.a.j();
            case 17:
                return this.a.s();
            case 18:
                int i7 = ((wfo) obj).k;
                return this.a.l();
            case 19:
                return wcq.D((wfh) this.a, (wfo) obj);
            default:
                int i8 = ((wfo) obj).k;
                wcq wcqVar4 = this.a;
                return new wfq(wcqVar4.k(), wcqVar4.j(), null);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
