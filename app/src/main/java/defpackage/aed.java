package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aed {
    public static final /* synthetic */ int a = 0;
    private static final wt b = new wt(2);
    private static final Comparator c = new Comparator() { // from class: aea
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int i = aed.a;
            int length = bArr.length;
            int length2 = bArr2.length;
            if (length != length2) {
                return length - length2;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b2 = bArr[i2];
                byte b3 = bArr2[i2];
                if (b2 != b3) {
                    return b2 - b3;
                }
            }
            return 0;
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:111:0x024a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #4 {all -> 0x024a, all -> 0x020a, all -> 0x023c, blocks: (B:3:0x0007, B:4:0x000e, B:6:0x0014, B:13:0x0047, B:39:0x00cb, B:40:0x00d2, B:85:0x01eb, B:99:0x020b, B:100:0x020e, B:37:0x00c5, B:106:0x023d, B:107:0x0240, B:108:0x0241, B:41:0x00d9, B:83:0x01dc, B:84:0x01df, B:95:0x0203, B:96:0x0206, B:97:0x0209, B:7:0x0029, B:11:0x0034, B:15:0x004c, B:17:0x0052, B:19:0x005a, B:21:0x006d, B:22:0x0079, B:23:0x007f, B:25:0x0085, B:34:0x00bd, B:29:0x009f, B:31:0x00a5, B:33:0x00b9, B:35:0x00c1, B:101:0x020f, B:102:0x022f, B:103:0x0230, B:104:0x023b, B:10:0x002e), top: B:122:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dc A[Catch: all -> 0x020a, Merged into TryCatch #4 {all -> 0x024a, all -> 0x020a, all -> 0x023c, blocks: (B:3:0x0007, B:4:0x000e, B:6:0x0014, B:13:0x0047, B:39:0x00cb, B:40:0x00d2, B:85:0x01eb, B:99:0x020b, B:100:0x020e, B:37:0x00c5, B:106:0x023d, B:107:0x0240, B:108:0x0241, B:41:0x00d9, B:83:0x01dc, B:84:0x01df, B:95:0x0203, B:96:0x0206, B:97:0x0209, B:7:0x0029, B:11:0x0034, B:15:0x004c, B:17:0x0052, B:19:0x005a, B:21:0x006d, B:22:0x0079, B:23:0x007f, B:25:0x0085, B:34:0x00bd, B:29:0x009f, B:31:0x00a5, B:33:0x00b9, B:35:0x00c1, B:101:0x020f, B:102:0x022f, B:103:0x0230, B:104:0x023b, B:10:0x002e), top: B:122:0x0007 }, TRY_ENTER] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.aem a(android.content.Context r25, java.util.List r26) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aed.a(android.content.Context, java.util.List):aem");
    }
}
