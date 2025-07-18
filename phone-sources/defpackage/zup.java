package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zup implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;
    public final Map a = new TreeMap();
    public transient long b;

    public zup(long j) {
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.b = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b);
    }

    final void a(int i, byte[] bArr, byte[] bArr2, zuz zuzVar) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
    }

    public zup(zup zupVar, long j) {
        for (Integer num : zupVar.a.keySet()) {
            this.a.put(num, new zuo((zuo) zupVar.a.get(num)));
        }
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zup(defpackage.zvh r25, long r26, byte[] r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zup.<init>(zvh, long, byte[], byte[]):void");
    }
}
