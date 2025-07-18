package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebp extends ebr implements ebo {
    private final ebt e;
    private long f;

    public ebp() {
        this(null);
    }

    @Override // defpackage.ebr
    public final float a(long j) {
        double d;
        boolean z;
        ebp ebpVar = this;
        long j2 = j;
        if (ebpVar.f == Long.MIN_VALUE) {
            ebpVar.f = j2;
            float f = ebpVar.f("initial").c;
            float f2 = ebpVar.f("end").c;
            ebt ebtVar = ebpVar.e;
            ebs ebsVar = ebtVar.b;
            ebsVar.a = f;
            Iterator it = ebtVar.h.iterator();
            while (it.hasNext()) {
                ((ebv) it.next()).d();
            }
            double d2 = ebsVar.a;
            ebtVar.e = d2;
            ebtVar.d.a = d2;
            ebsVar.b = 0.0d;
            ebtVar.b(f2);
            return f;
        }
        float f3 = ebpVar.f("end").c;
        ebt ebtVar2 = ebpVar.e;
        ebtVar2.b(f3);
        if (ebtVar2.a()) {
            return f3;
        }
        long j3 = j2 - ebpVar.f;
        boolean zA = ebtVar2.a();
        double d3 = j3;
        if (!zA || !ebtVar2.f) {
            double d4 = d3 / 1.0E9d;
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            ebtVar2.g += d4;
            ebu ebuVar = ebtVar2.a;
            double d5 = ebuVar.c;
            double d6 = ebuVar.b;
            ebs ebsVar2 = ebtVar2.b;
            ebs ebsVar3 = ebtVar2.d;
            double d7 = ebsVar2.a;
            double d8 = ebsVar2.b;
            double d9 = ebsVar3.a;
            double d10 = ebsVar3.b;
            while (true) {
                d = ebtVar2.g;
                if (d < 0.001d) {
                    break;
                }
                double d11 = d - 0.001d;
                ebtVar2.g = d11;
                if (d11 < 0.001d) {
                    ebs ebsVar4 = ebtVar2.c;
                    ebsVar4.a = d7;
                    ebsVar4.b = d8;
                }
                double d12 = ebtVar2.e;
                double d13 = ((d12 - d9) * 230.2d) - (d8 * 22.0d);
                double d14 = d8 + (d13 * 0.001d * 0.5d);
                double d15 = ((d12 - (d7 + ((d8 * 0.001d) * 0.5d))) * 230.2d) - (d14 * 22.0d);
                double d16 = d8 + (d15 * 0.001d * 0.5d);
                double d17 = d7 + (d16 * 0.001d);
                double d18 = ((d12 - (d7 + ((d14 * 0.001d) * 0.5d))) * 230.2d) - (d16 * 22.0d);
                double d19 = d8 + (d18 * 0.001d);
                double d20 = d14 + d16;
                d7 += (d8 + d20 + d20 + d19) * 0.16666666666666666d * 0.001d;
                double d21 = d15 + d18;
                d8 += (d13 + d21 + d21 + (((d12 - d17) * 230.2d) - (22.0d * d19))) * 0.16666666666666666d * 0.001d;
                d9 = d17;
                d10 = d19;
            }
            ebsVar3.a = d9;
            ebsVar3.b = d10;
            ebsVar2.a = d7;
            ebsVar2.b = d8;
            if (d > 0.0d) {
                double d22 = d / 0.001d;
                ebs ebsVar5 = ebtVar2.c;
                double d23 = 1.0d - d22;
                ebsVar2.a = (d7 * d22) + (ebsVar5.a * d23);
                ebsVar2.b = (d8 * d22) + (ebsVar5.b * d23);
            }
            boolean z2 = true;
            if (ebtVar2.a()) {
                ebsVar2.a = ebtVar2.e;
                if (ebsVar2.b != 0.0d) {
                    ebsVar2.b = 0.0d;
                }
                zA = true;
            }
            if (ebtVar2.f) {
                ebtVar2.f = false;
                z = true;
            } else {
                z = false;
            }
            if (zA) {
                ebtVar2.f = true;
            } else {
                z2 = false;
            }
            Iterator it2 = ebtVar2.h.iterator();
            while (it2.hasNext()) {
                ebv ebvVar = (ebv) it2.next();
                if (z) {
                    ebvVar.a();
                }
                ebvVar.d();
                if (z2) {
                    ebvVar.b();
                }
            }
            ebpVar = this;
            j2 = j;
        }
        ebpVar.f = j2;
        return (float) ebtVar2.b.a;
    }

    @Override // defpackage.ebo
    public final boolean b() {
        return this.e.a();
    }

    public ebp(ebu ebuVar) {
        this.f = Long.MIN_VALUE;
        ebt ebtVar = new ebt();
        this.e = ebtVar;
        if (ebuVar != null) {
            ebtVar.a = ebuVar;
        }
    }
}
