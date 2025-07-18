package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebr {
    public final ImmutableList a;
    public final List b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public ebs d;
    public boolean e;

    public ebr(ImmutableList immutableList) {
        this.a = immutableList;
        ebs ebsVar = ebs.a;
        this.d = ebs.a;
        this.e = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final void b(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= a()) {
                if (!this.c[i].hasRemaining()) {
                    List list = this.b;
                    ebu ebuVar = (ebu) list.get(i);
                    if (!ebuVar.h()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : ebu.a;
                        long jRemaining = byteBuffer2.remaining();
                        ebuVar.e(byteBuffer2);
                        this.c[i] = ebuVar.b();
                        boolean z2 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((ebu) list.get(i + 1)).d();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final boolean c() {
        return this.e && ((ebu) this.b.get(a())).h() && !this.c[a()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebr)) {
            return false;
        }
        ImmutableList immutableList = this.a;
        int size = immutableList.size();
        ImmutableList immutableList2 = ((ebr) obj).a;
        if (size != immutableList2.size()) {
            return false;
        }
        for (int i = 0; i < immutableList.size(); i++) {
            if (immutableList.get(i) != immutableList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
