package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egr {
    public final HashMap a;
    public final SparseArray b;
    public final egq c;
    public egq d;
    private final SparseBooleanArray e;
    private final SparseBooleanArray f;

    public egr(kdh kdhVar, File file, boolean z) {
        boolean z2 = true;
        if (kdhVar == null && file == null) {
            z2 = false;
        }
        a.ab(z2);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.e = new SparseBooleanArray();
        this.f = new SparseBooleanArray();
        ego egoVar = kdhVar != null ? new ego(kdhVar) : null;
        egp egpVar = file != null ? new egp(new File(file, "cached_content_index.exi")) : null;
        if (egoVar != null && (egpVar == null || !z)) {
            this.c = egoVar;
            this.d = egpVar;
        } else {
            String str = edt.a;
            this.c = egpVar;
            this.d = egoVar;
        }
    }

    public static egt c(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(a.cf(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = edt.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new egt(map);
    }

    public static void f(egt egtVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = egtVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final egn a(String str) {
        return (egn) this.a.get(str);
    }

    public final egn b(String str) {
        HashMap map = this.a;
        egn egnVar = (egn) map.get(str);
        if (egnVar != null) {
            return egnVar;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        egn egnVar2 = new egn(iKeyAt, str, egt.a);
        map.put(str, egnVar2);
        sparseArray.put(iKeyAt, str);
        this.f.put(iKeyAt, true);
        this.c.e(egnVar2);
        return egnVar2;
    }

    public final void d(String str) {
        HashMap map = this.a;
        egn egnVar = (egn) map.get(str);
        if (egnVar != null && egnVar.b() && egnVar.d.isEmpty()) {
            map.remove(str);
            int i = egnVar.a;
            SparseBooleanArray sparseBooleanArray = this.f;
            egq egqVar = this.c;
            boolean z = sparseBooleanArray.get(i);
            egqVar.d(egnVar, z);
            if (z) {
                this.b.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                this.b.put(i, null);
                this.e.put(i, true);
            }
        }
    }

    public final void e() {
        this.c.g(this.a);
        SparseBooleanArray sparseBooleanArray = this.e;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f.clear();
    }
}
