package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agvj implements Serializable, agvu {
    protected final Object a;
    private final Class b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final int g;

    public agvj(Object obj, Class cls, String str, String str2, int i) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i & 1);
        this.f = 1;
        this.g = i >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agvj)) {
            return false;
        }
        agvj agvjVar = (agvj) obj;
        if (this.e == agvjVar.e) {
            int i = agvjVar.f;
            if (this.g == agvjVar.g && agvy.c(this.a, agvjVar.a) && agvy.c(this.b, agvjVar.b) && this.c.equals(agvjVar.c) && this.d.equals(agvjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + 1) * 31) + this.g;
    }

    @Override // defpackage.agvu
    public final int i() {
        return 1;
    }

    public final String toString() {
        return agwi.a.a(this);
    }

    public agvj(Class cls) {
        this(agvo.b, cls, "refreshSearchAccount", "initStartup$refreshSearchAccount(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
