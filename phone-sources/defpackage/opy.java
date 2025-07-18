package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class opy implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ opy(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return this.a.a(obj);
            case 1:
                return this.a.a(obj);
            case 2:
                return this.a.remove((String) obj);
            case 3:
                return ((sik) this.a).o();
            case 4:
                sik sikVar = (sik) this.a;
                return new rza(sikVar.p(), sikVar.o());
            case 5:
                ssc sscVar = (ssc) obj;
                sik.z(sscVar);
                sik.y(sscVar);
                return Double.valueOf(ssb.a(((Double) ((sik) this.a).r().c.apply(sscVar)).doubleValue(), 4.5d));
            case 6:
                return ((sik) this.a).r();
            case 7:
                ssc sscVar2 = (ssc) obj;
                sik.z(sscVar2);
                sik.y(sscVar2);
                return Double.valueOf(ssb.a(((Double) ((sik) this.a).p().c.apply(sscVar2)).doubleValue(), 4.5d));
            case 8:
                return ((sik) this.a).p();
            case 9:
                sik sikVar2 = (sik) this.a;
                return new rza(sikVar2.l(), sikVar2.k());
            case 10:
                return ((sik) this.a).l();
            case 11:
                sik sikVar3 = (sik) this.a;
                return new rza(sikVar3.l(), sikVar3.k());
            case 12:
                sik sikVar4 = (sik) this.a;
                return new rza(sikVar4.n(), sikVar4.m());
            case 13:
                sik sikVar5 = (sik) this.a;
                return new rza(sikVar5.r(), sikVar5.q());
            case 14:
                sik sikVar6 = (sik) this.a;
                return new rza(sikVar6.p(), sikVar6.o());
            case 15:
                sik sikVar7 = (sik) this.a;
                return new rza(sikVar7.n(), sikVar7.m());
            case 16:
                return ((sik) this.a).m();
            case 17:
                return ((sik) this.a).q();
            case 18:
                return ((sik) this.a).k();
            case 19:
                ssc sscVar3 = (ssc) obj;
                sik.y(sscVar3);
                return Double.valueOf(ssb.a(((Double) ((sik) this.a).n().c.apply(sscVar3)).doubleValue(), 4.5d));
            default:
                return ((sik) this.a).n();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
