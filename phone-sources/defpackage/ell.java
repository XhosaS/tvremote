package defpackage;

import android.os.Build;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.Objects;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ell {
    public static final ell a;
    public final int b;
    public final int c;
    public final ImmutableSet d;

    static {
        ell ellVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            for (int i = 1; i <= 10; i++) {
                builder.add((ImmutableSet.Builder) Integer.valueOf(edt.h(i)));
            }
            ellVar = new ell(2, builder.build());
        } else {
            ellVar = new ell(2, 10);
        }
        a = ellVar;
    }

    public ell(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ell)) {
            return false;
        }
        ell ellVar = (ell) obj;
        return this.b == ellVar.b && this.c == ellVar.c && Objects.equals(this.d, ellVar.d);
    }

    public final int hashCode() {
        ImmutableSet immutableSet = this.d;
        return (((this.b * 31) + this.c) * 31) + (immutableSet == null ? 0 : immutableSet.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.b + ", maxChannelCount=" + this.c + ", channelMasks=" + String.valueOf(this.d) + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ell(int i, Set set) {
        this.b = i;
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) set);
        this.d = immutableSetCopyOf;
        UnmodifiableIterator it = immutableSetCopyOf.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.c = iMax;
    }
}
