package defpackage;

import android.net.Uri;
import android.os.LocaleList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eux {
    public final Object a;
    public Object b;
    public Object c;

    public eux() {
        this.a = new cko();
    }

    public final long a() {
        Object obj = this.c;
        if (obj != null) {
            return ((fdi) obj).b;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [fdp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [fds, java.lang.Object] */
    public final void b(dyu dyuVar, Uri uri, Map map, long j, long j2, fdr fdrVar) throws IOException {
        fdi fdiVar = new fdi(dyuVar, j, j2);
        this.c = fdiVar;
        if (this.b != null) {
            return;
        }
        fdp[] fdpVarArrA = this.a.a(uri, map);
        int length = fdpVarArrA.length;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(length);
        if (length == 1) {
            this.b = fdpVarArrA[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                fdp fdpVar = fdpVarArrA[i];
                try {
                } catch (EOFException unused) {
                    a.ab(this.b != null || fdiVar.b == j);
                } catch (Throwable th) {
                    a.ab(this.b != null || fdiVar.b == j);
                    fdiVar.k();
                    throw th;
                }
                if (fdpVar.e(fdiVar)) {
                    this.b = fdpVar;
                    a.ab(fdpVar != null || fdiVar.b == j);
                    fdiVar.k();
                } else {
                    builderBuilderWithExpectedSize.addAll((Iterable) fdpVar.x());
                    a.ab(this.b != null || fdiVar.b == j);
                    fdiVar.k();
                    i++;
                }
            }
            if (this.b == null) {
                throw new exj("None of the available extractors (" + new tsp(", ").b(Lists.transform(ImmutableList.copyOf(fdpVarArrA), new dzc(15))) + ") could read the stream.", builderBuilderWithExpectedSize.build());
            }
        }
        this.b.y(fdrVar);
    }

    public final ckq c() {
        Object obj = this.a;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (obj) {
            Object obj2 = this.c;
            if (obj2 != null && localeList == this.b) {
                return (ckq) obj2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new ckp(localeList.get(i)));
            }
            ckq ckqVar = new ckq(arrayList);
            this.b = localeList;
            this.c = ckqVar;
            return ckqVar;
        }
    }

    public eux(Object obj) {
        this.a = obj;
    }

    public eux(char[] cArr) {
        this.a = new hv();
    }

    public eux(byte[] bArr, byte[] bArr2) {
        long[] jArr = kj.a;
        this.a = new ki((byte[]) null);
    }

    public eux(int i) {
        this.a = i != 1 ? new jp(i) : null;
    }
}
