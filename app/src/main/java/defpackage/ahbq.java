package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbq extends agsq implements ahek {
    public static final ahbp a = new ahbp();
    public final long b;

    public ahbq(long j) {
        super(a);
        this.b = j;
    }

    @Override // defpackage.ahek
    public final /* bridge */ /* synthetic */ Object a(agte agteVar) {
        ahbs ahbsVar = (ahbs) agteVar.get(ahbs.a);
        String str = ahbsVar != null ? ahbsVar.b : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iU = agyv.u(name, " @");
        if (iU < 0) {
            iU = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iU + 10);
        String strSubstring = name.substring(0, iU);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.b);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.ahek
    public final /* synthetic */ void b(agte agteVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahbq) && this.b == ((ahbq) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.b + ")";
    }
}
