package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahcs extends ahcu {
    final /* synthetic */ ahcw a;
    private final ahap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahcs(ahcw ahcwVar, long j, ahap ahapVar) {
        super(j);
        this.a = ahcwVar;
        this.c = ahapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.a, agpu.a);
    }

    @Override // defpackage.ahcu
    public final String toString() {
        String string = super.toString();
        ahap ahapVar = this.c;
        Objects.toString(ahapVar);
        return string.concat(ahapVar.toString());
    }
}
