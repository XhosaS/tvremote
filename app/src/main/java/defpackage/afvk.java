package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afvk implements afrh {
    public agaf b;
    public int c;
    public final agag g;
    public final afzw h;
    public boolean i;
    public int j;
    public long l;
    private final afvj m;
    public int a = -1;
    public affa d = afey.a;
    public final afvi e = new afvi(this);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public afvk(afvj afvjVar, agag agagVar, afzw afzwVar) {
        this.m = afvjVar;
        this.g = agagVar;
        this.h = afzwVar;
    }

    public final void a(boolean z, boolean z2) {
        agaf agafVar = this.b;
        this.b = null;
        this.m.o(agafVar, z, z2, this.j);
        this.j = 0;
    }

    public final void b(afvh afvhVar, boolean z) {
        List list = afvhVar.a;
        Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((agaf) it.next()).a();
        }
        int i = this.a;
        if (i >= 0 && iA > i) {
            throw new afjx(Status.h.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.a))), null);
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        agaf agafVarA = this.g.a(5);
        agafVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.b = agafVarA;
            return;
        }
        afvj afvjVar = this.m;
        afvjVar.o(agafVarA, false, false, this.j - 1);
        this.j = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            afvjVar.o((agaf) list.get(i2), false, false, 0);
        }
        this.b = (agaf) list.get(list.size() - 1);
        this.l = iA;
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            agaf agafVar = this.b;
            if (agafVar != null && agafVar.b() == 0) {
                a(false, false);
            }
            if (this.b == null) {
                yqw.M(this.c > 0, "knownLengthPendingAllocation reached 0");
                agaf agafVarA = this.g.a(this.c);
                this.b = agafVarA;
                int i3 = this.c;
                this.c = i3 - Math.min(i3, agafVarA.b());
            }
            int iMin = Math.min(i2, this.b.b());
            this.b.d(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
