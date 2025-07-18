package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayh {
    public final np a;
    public long b = 0;
    public clx c = new cly(0.0f, 0.0f);
    public mr d;
    public mr e;
    public mr f;
    public mr g;
    private final aeh h;

    public ayh(aeh aehVar, np npVar) {
        this.h = aehVar;
        this.a = npVar;
    }

    public static /* synthetic */ float a(ayh ayhVar) {
        long j = ayhVar.b;
        clx clxVar = ayhVar.c;
        mr mrVarA = ayhVar.g;
        if (mrVarA == null) {
            mrVarA = ms.a(ayhVar.h.c.a(j, clxVar));
            ayhVar.g = mrVarA;
        }
        return ((Number) mrVarA.d()).floatValue();
    }

    public static /* synthetic */ float b(ayh ayhVar) {
        long j = ayhVar.b;
        clx clxVar = ayhVar.c;
        mr mrVarA = ayhVar.f;
        if (mrVarA == null) {
            mrVarA = ms.a(ayhVar.h.d.a(j, clxVar));
            ayhVar.f = mrVarA;
        }
        return ((Number) mrVarA.d()).floatValue();
    }

    public static /* synthetic */ float c(ayh ayhVar) {
        long j = ayhVar.b;
        clx clxVar = ayhVar.c;
        mr mrVarA = ayhVar.e;
        if (mrVarA == null) {
            mrVarA = ms.a(ayhVar.h.b.a(j, clxVar));
            ayhVar.e = mrVarA;
        }
        return ((Number) mrVarA.d()).floatValue();
    }

    public static /* synthetic */ float d(ayh ayhVar) {
        long j = ayhVar.b;
        clx clxVar = ayhVar.c;
        mr mrVarA = ayhVar.d;
        if (mrVarA == null) {
            mrVarA = ms.a(ayhVar.h.a.a(j, clxVar));
            ayhVar.d = mrVarA;
        }
        return ((Number) mrVarA.d()).floatValue();
    }
}
