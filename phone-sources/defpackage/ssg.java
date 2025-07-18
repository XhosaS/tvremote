package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssg implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ssg(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ssa ssaVar;
        double dA;
        double d;
        boolean z = true;
        switch (this.a) {
            case 0:
                break;
            case 1:
                ssc sscVar = (ssc) obj;
                sik.z(sscVar);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ssc sscVar2 = (ssc) obj;
                sik.z(sscVar2);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                ssc sscVar3 = (ssc) obj;
                sik.z(sscVar3);
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                ssc sscVar4 = (ssc) obj;
                if (sscVar4.b) {
                    ssaVar = new ssa(10.0d, 10.0d, 11.0d, 12.0d);
                    dA = ssaVar.a(sscVar4.c);
                } else {
                    ssaVar = new ssa(96.0d, 96.0d, 96.0d, 95.0d);
                    dA = ssaVar.a(sscVar4.c);
                }
                break;
            case 16:
                break;
            case 17:
                ssc sscVar5 = (ssc) obj;
                boolean z2 = sscVar5.b;
                double d2 = true != z2 ? 90.0d : 30.0d;
                sik.z(sscVar5);
                sik.y(sscVar5);
                wfj wfjVar = sscVar5.f;
                double d3 = wfjVar.a;
                double d4 = wfjVar.b;
                ssd ssdVarA = ssd.a(d3, d4, d2);
                double d5 = ssdVarA.b;
                if (d5 < d4) {
                    double dMax = d5;
                    while (true) {
                        double d6 = ssdVarA.b;
                        if (d6 < d4) {
                            d = (z != z2 ? -1.0d : 1.0d) + d2;
                            ssd ssdVarA2 = ssd.a(d3, d4, d);
                            double d7 = dMax;
                            double d8 = ssdVarA2.b;
                            if (d7 <= d8) {
                                double d9 = d8 - d4;
                                if (Math.abs(d9) >= 0.4d) {
                                    if (Math.abs(d9) < Math.abs(d6 - d4)) {
                                        ssdVarA = ssdVarA2;
                                    }
                                    dMax = Math.max(d7, d8);
                                    d2 = d;
                                    z = true;
                                }
                            }
                        }
                    }
                    d2 = d;
                }
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return ((ssc) obj).h;
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
