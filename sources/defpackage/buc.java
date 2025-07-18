package defpackage;

import android.content.Context;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLServerSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buc extends Thread {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/pairing/TcpPairingServer");
    public final Context b;
    public final bty c;
    public final SSLServerSocket e;
    public int f;
    public long g;
    public volatile boolean h;
    public byj i;
    private final bsi k;
    public final AtomicReference d = new AtomicReference();
    private final int j = 1;

    public buc(Context context, bsi bsiVar, bty btyVar) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        this.b = context;
        this.k = bsiVar;
        this.c = btyVar;
        setName("TcpPairingServer");
        KeyManager[] keyManagerArrA = btyVar.a();
        cbt cbtVar = a;
        cch cchVarE = cbtVar.e();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/pairing/TcpPairingServer", "setupServerSocket", 183, "TcpPairingServer.java")).p("Creating socket factory");
        SSLServerSocket sSLServerSocket = (SSLServerSocket) aju.e(keyManagerArrA, null).createServerSocket(6467, 1);
        aju.f(sSLServerSocket);
        this.e = sSLServerSocket;
        ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/pairing/TcpPairingServer", "<init>", 83, "TcpPairingServer.java")).p("TcpPairingServerThread init complete!");
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x020a A[Catch: IOException -> 0x0394, TryCatch #5 {IOException -> 0x0394, blocks: (B:160:0x0002, B:162:0x0006, B:169:0x007b, B:171:0x0082, B:173:0x009b, B:175:0x00a9, B:216:0x020a, B:218:0x0211, B:220:0x023d, B:221:0x023f, B:234:0x0267, B:231:0x0262, B:238:0x026c, B:241:0x0271, B:242:0x0293, B:244:0x02bb, B:245:0x02d0, B:248:0x02d5, B:249:0x02f2, B:260:0x0311, B:258:0x0306, B:217:0x020e, B:206:0x01c6, B:211:0x01f3, B:213:0x01fa, B:261:0x031e, B:262:0x0325, B:263:0x0326, B:264:0x032b, B:273:0x035f, B:275:0x0369, B:278:0x036d, B:209:0x01d5, B:222:0x0240, B:224:0x0247, B:226:0x024f, B:233:0x0266, B:229:0x0257, B:230:0x0261, B:177:0x00e5, B:179:0x010a, B:181:0x011e, B:183:0x014b, B:185:0x0153, B:187:0x015f, B:196:0x0188, B:190:0x0168, B:191:0x0179, B:192:0x017a, B:194:0x0180, B:197:0x019d, B:198:0x01ae, B:199:0x01af, B:200:0x01b4, B:201:0x01b5, B:202:0x01bc, B:203:0x01bd, B:204:0x01c4, B:180:0x011c), top: B:286:0x0002, inners: #1, #3, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x020e A[Catch: IOException -> 0x0394, TryCatch #5 {IOException -> 0x0394, blocks: (B:160:0x0002, B:162:0x0006, B:169:0x007b, B:171:0x0082, B:173:0x009b, B:175:0x00a9, B:216:0x020a, B:218:0x0211, B:220:0x023d, B:221:0x023f, B:234:0x0267, B:231:0x0262, B:238:0x026c, B:241:0x0271, B:242:0x0293, B:244:0x02bb, B:245:0x02d0, B:248:0x02d5, B:249:0x02f2, B:260:0x0311, B:258:0x0306, B:217:0x020e, B:206:0x01c6, B:211:0x01f3, B:213:0x01fa, B:261:0x031e, B:262:0x0325, B:263:0x0326, B:264:0x032b, B:273:0x035f, B:275:0x0369, B:278:0x036d, B:209:0x01d5, B:222:0x0240, B:224:0x0247, B:226:0x024f, B:233:0x0266, B:229:0x0257, B:230:0x0261, B:177:0x00e5, B:179:0x010a, B:181:0x011e, B:183:0x014b, B:185:0x0153, B:187:0x015f, B:196:0x0188, B:190:0x0168, B:191:0x0179, B:192:0x017a, B:194:0x0180, B:197:0x019d, B:198:0x01ae, B:199:0x01af, B:200:0x01b4, B:201:0x01b5, B:202:0x01bc, B:203:0x01bd, B:204:0x01c4, B:180:0x011c), top: B:286:0x0002, inners: #1, #3, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x023d A[Catch: IOException -> 0x0394, TryCatch #5 {IOException -> 0x0394, blocks: (B:160:0x0002, B:162:0x0006, B:169:0x007b, B:171:0x0082, B:173:0x009b, B:175:0x00a9, B:216:0x020a, B:218:0x0211, B:220:0x023d, B:221:0x023f, B:234:0x0267, B:231:0x0262, B:238:0x026c, B:241:0x0271, B:242:0x0293, B:244:0x02bb, B:245:0x02d0, B:248:0x02d5, B:249:0x02f2, B:260:0x0311, B:258:0x0306, B:217:0x020e, B:206:0x01c6, B:211:0x01f3, B:213:0x01fa, B:261:0x031e, B:262:0x0325, B:263:0x0326, B:264:0x032b, B:273:0x035f, B:275:0x0369, B:278:0x036d, B:209:0x01d5, B:222:0x0240, B:224:0x0247, B:226:0x024f, B:233:0x0266, B:229:0x0257, B:230:0x0261, B:177:0x00e5, B:179:0x010a, B:181:0x011e, B:183:0x014b, B:185:0x0153, B:187:0x015f, B:196:0x0188, B:190:0x0168, B:191:0x0179, B:192:0x017a, B:194:0x0180, B:197:0x019d, B:198:0x01ae, B:199:0x01af, B:200:0x01b4, B:201:0x01b5, B:202:0x01bc, B:203:0x01bd, B:204:0x01c4, B:180:0x011c), top: B:286:0x0002, inners: #1, #3, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0271 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws defpackage.bll, java.lang.InterruptedException, java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buc.run():void");
    }
}
