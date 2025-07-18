package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmw {
    public final yfo a;
    public final tst b;
    public final tst c;
    public final tst d;
    public final tst e;
    public final tst f;
    public final tst g;
    public final tst h;
    public final tst i;
    public final tst j;
    public final tst k;
    public final tst l;
    public final tst m;
    public final tst n;
    public final tst o;

    public rmw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmw) {
            rmw rmwVar = (rmw) obj;
            if (this.a.equals(rmwVar.a) && this.b.equals(rmwVar.b) && this.c.equals(rmwVar.c) && this.d.equals(rmwVar.d) && this.e.equals(rmwVar.e) && this.f.equals(rmwVar.f) && this.g.equals(rmwVar.g) && this.h.equals(rmwVar.h) && this.i.equals(rmwVar.i) && this.j.equals(rmwVar.j) && this.k.equals(rmwVar.k) && this.l.equals(rmwVar.l) && this.m.equals(rmwVar.m) && this.n.equals(rmwVar.n) && this.o.equals(rmwVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "PrimesConfigurations{metricTransmittersProvider=" + this.a.toString() + ", globalConfigurationsProvider=Optional.absent(), memoryConfigurationsProvider=" + this.c.toString() + ", timerConfigurationsProvider=" + this.d.toString() + ", crashConfigurationsProvider=" + this.e.toString() + ", cuiConfigurationsProvider=Optional.absent(), applicationExitConfigurationsProvider=Optional.absent(), networkConfigurationsProvider=" + this.h.toString() + ", storageConfigurationsProvider=" + this.i.toString() + ", jankConfigurationsProvider=" + this.j.toString() + ", monitorAllActivitiesProvider=Optional.absent(), tikTokTraceConfigurationsProvider=Optional.absent(), traceConfigurationsProvider=Optional.absent(), batteryConfigurationsProvider=" + this.n.toString() + ", cpuProfilingConfigurationsProvider=Optional.absent()}";
    }

    public rmw(yfo yfoVar, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, tst tstVar5, tst tstVar6, tst tstVar7, tst tstVar8, tst tstVar9, tst tstVar10, tst tstVar11, tst tstVar12, tst tstVar13, tst tstVar14) {
        this.a = yfoVar;
        this.b = tstVar;
        this.c = tstVar2;
        this.d = tstVar3;
        this.e = tstVar4;
        this.f = tstVar5;
        this.g = tstVar6;
        this.h = tstVar7;
        this.i = tstVar8;
        this.j = tstVar9;
        this.k = tstVar10;
        this.l = tstVar11;
        this.m = tstVar12;
        this.n = tstVar13;
        this.o = tstVar14;
    }
}
