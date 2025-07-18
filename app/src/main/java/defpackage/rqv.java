package defpackage;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rqv {
    public static final AtomicLong a = new AtomicLong();

    protected abstract long a();

    public abstract epa b();

    public abstract rpz c();

    public abstract yqt d();

    public abstract yqt e();

    public abstract yqt f();

    public abstract yyr g();

    public abstract yzq h();

    public abstract void i();

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(c().b);
        sb.append("> (ID:");
        sb.append(((rqm) c().a).a);
        sb.append(") ");
        sb.append(((rqm) c().a).c);
        adga adgaVar = ((epb) b().b).d;
        if (adgaVar == null) {
            adgaVar = adga.a;
        }
        if ((adgaVar.b & 2) != 0) {
            sb.append(" Status: ");
            adga adgaVar2 = ((epb) b().b).d;
            if (adgaVar2 == null) {
                adgaVar2 = adga.a;
            }
            adfz adfzVar = adgaVar2.d;
            if (adfzVar == null) {
                adfzVar = adfz.a;
            }
            if ((adfzVar.b & 2) != 0) {
                adga adgaVar3 = ((epb) b().b).d;
                if (adgaVar3 == null) {
                    adgaVar3 = adga.a;
                }
                adfz adfzVar2 = adgaVar3.d;
                if (adfzVar2 == null) {
                    adfzVar2 = adfz.a;
                }
                sb.append(adfzVar2.d);
                sb.append(":");
                adga adgaVar4 = ((epb) b().b).d;
                if (adgaVar4 == null) {
                    adgaVar4 = adga.a;
                }
                adfz adfzVar3 = adgaVar4.d;
                if (adfzVar3 == null) {
                    adfzVar3 = adfz.a;
                }
                sb.append(adfzVar3.c);
            } else {
                adga adgaVar5 = ((epb) b().b).d;
                if (adgaVar5 == null) {
                    adgaVar5 = adga.a;
                }
                adfz adfzVar4 = adgaVar5.d;
                if (adfzVar4 == null) {
                    adfzVar4 = adfz.a;
                }
                abqb abqbVarB = abqb.b(adfzVar4.c);
                if (abqbVarB == null) {
                    abqbVarB = abqb.UNKNOWN;
                }
                sb.append(abqbVarB.name());
            }
        }
        sb.append(" Timestamp");
        if (d().g()) {
            sb.append(" [Custom]: ");
            sb.append(d().c());
        } else {
            sb.append(": ");
            adga adgaVar6 = ((epb) b().b).d;
            if (adgaVar6 == null) {
                adgaVar6 = adga.a;
            }
            abzy abzyVar = adgaVar6.c;
            if (abzyVar == null) {
                abzyVar = abzy.a;
            }
            sb.append(acbj.b(abzyVar));
        }
        sb.append("ns. ");
        if (!g().isEmpty()) {
            sb.append(", Tags: [");
            zdl it = g().keySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!z) {
                    sb.append("; ");
                }
                sb.append(str);
                sb.append(":");
                Set set = (Set) g().get(str);
                if (set == null) {
                    sb.append("<null>");
                } else {
                    new yqn(",").e(sb, set);
                }
                z = false;
            }
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }
}
