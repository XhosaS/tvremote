package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdn {
    public final String[] a;
    public final long[] b;
    public final uir c;
    public whb d;
    private final long[] e;
    private final uir f;
    private final whf g;
    private ImmutableList h;

    public tdn() {
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.g = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tdn) {
            tdn tdnVar = (tdn) obj;
            if (Arrays.equals(this.b, tdnVar.b)) {
                long[] jArr = tdnVar.e;
                if (Arrays.equals((long[]) null, (long[]) null) && Objects.equals(this.c, tdnVar.c)) {
                    uir uirVar = tdnVar.f;
                    if (Objects.equals(null, null)) {
                        whf whfVar = tdnVar.g;
                        if (Objects.equals(null, null)) {
                            ImmutableList immutableList = tdnVar.h;
                            if (Objects.equals(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode((long[]) null)), null, this.c, null, null);
    }

    public tdn(uir uirVar) {
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.d = null;
        this.c = uirVar;
        this.h = null;
    }

    public tdn(String[] strArr, long[] jArr, uir uirVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.d = null;
        this.a = strArr;
        this.b = jArr;
        this.c = uirVar;
    }
}
