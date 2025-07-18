package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class aacn extends aacl implements Serializable, aacg {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile aabk b;

    public aacn() {
        this(aabp.a(), aadl.P());
    }

    @Override // defpackage.aacg
    public final long a() {
        return this.a;
    }

    @Override // defpackage.aacg
    public final aabk b() {
        return this.b;
    }

    public aacn(long j, aabk aabkVar) {
        Map map = aabp.a;
        this.b = aabkVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }
}
