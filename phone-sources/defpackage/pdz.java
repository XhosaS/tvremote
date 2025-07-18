package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pdz implements smv {
    @Override // defpackage.smv
    public final void a(rzy rzyVar) throws InterruptedException {
        rzy rzyVar2 = new rzy((char[]) null);
        rzyVar2.A("INSERT INTO chime_versioned_identifiers");
        rzyVar2.A("(");
        rzyVar2.A("account");
        rzyVar2.A(",key");
        rzyVar2.A(",value");
        rzyVar2.A(")");
        rzyVar2.A("SELECT ");
        rzyVar2.A("promotions.account");
        rzyVar2.A(", ");
        rzyVar2.A("chime_versioned_identifiers.key");
        rzyVar2.A(", ");
        rzyVar2.A("chime_versioned_identifiers.value");
        rzyVar2.A(" FROM ");
        rzyVar2.A("chime_versioned_identifiers, promotions");
        rzyVar2.A(" WHERE ");
        rzyVar2.A("promotions.key");
        rzyVar2.A(" = ");
        rzyVar2.A("chime_versioned_identifiers.key");
        rzyVar.G(rzyVar2.H());
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("account = ?");
        arrayList.add("noaccount");
        rzyVar.F(sim.l("chime_versioned_identifiers", sb, arrayList));
        rzy rzyVar3 = new rzy((char[]) null);
        rzyVar3.A("INSERT INTO versioned_identifiers");
        rzyVar3.A("(");
        rzyVar3.A("account");
        rzyVar3.A(",key");
        rzyVar3.A(",value");
        rzyVar3.A(")");
        rzyVar3.A("SELECT ");
        rzyVar3.A("promotions.account");
        rzyVar3.A(", ");
        rzyVar3.A("versioned_identifiers.key");
        rzyVar3.A(", ");
        rzyVar3.A("versioned_identifiers.value");
        rzyVar3.A(" FROM ");
        rzyVar3.A("versioned_identifiers, promotions");
        rzyVar3.A(" WHERE ");
        rzyVar3.A("promotions.key");
        rzyVar3.A(" = ");
        rzyVar3.A("versioned_identifiers.key");
        rzyVar.G(rzyVar3.H());
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        sb2.append("account = ?");
        arrayList2.add("noaccount");
        rzyVar.F(sim.l("versioned_identifiers", sb2, arrayList2));
    }
}
