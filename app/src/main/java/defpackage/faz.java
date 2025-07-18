package defpackage;

import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.support.v4.media.session.PlaybackStateCompat;
import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faz implements fau {
    public static final Duration a;
    private static final zdy e = zdy.h("com/google/android/apps/tvsearch/app/params/media/MediaParamsBuilderImpl");
    private static final Map f = agrj.d(new agpi(64L, xed.FAST_FORWARD), new agpi(2L, xed.PAUSE), new agpi(4L, xed.PLAY), new agpi(2048L, xed.PLAY_FROM_SEARCH), new agpi(8192L, xed.PLAY_FROM_URI), new agpi(8L, xed.REWIND), new agpi(256L, xed.SEEK_TO), new agpi(128L, xed.SET_RATING), new agpi(262144L, xed.SET_REPEAT_MODE), new agpi(2097152L, xed.SHUFFLE), new agpi(32L, xed.SKIP_TO_NEXT), new agpi(16L, xed.SKIP_TO_PREVIOUS), new agpi(4096L, xed.SKIP_TO_QUEUE_ITEM), new agpi(1L, xed.STOP), new agpi(1048576L, xed.SET_CAPTIONING_ENABLED));
    public final fgx b;
    public final String c;
    public final String d;
    private final fda g;
    private final agte h;
    private final gtu i;
    private final goa j;
    private final MediaSessionManager k;

    static {
        Duration durationOfMillis = Duration.ofMillis(500L);
        durationOfMillis.getClass();
        a = durationOfMillis;
    }

    public faz(fda fdaVar, agte agteVar, gtu gtuVar, goa goaVar, MediaSessionManager mediaSessionManager, fgx fgxVar) {
        fdaVar.getClass();
        agteVar.getClass();
        gtuVar.getClass();
        fgxVar.getClass();
        this.g = fdaVar;
        this.h = agteVar;
        this.i = gtuVar;
        this.j = goaVar;
        this.k = mediaSessionManager;
        this.b = fgxVar;
        this.c = "media";
        this.d = "assistant.api.params.MediaParams";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3 A[Catch: SecurityException -> 0x0111, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0111, blocks: (B:48:0x00dd, B:50:0x00e3, B:55:0x010b), top: B:97:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b A[Catch: SecurityException -> 0x0111, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0111, blocks: (B:48:0x00dd, B:50:0x00e3, B:55:0x010b), top: B:97:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[Catch: SecurityException -> 0x0097, TRY_LEAVE, TryCatch #7 {SecurityException -> 0x0097, blocks: (B:28:0x0067, B:60:0x0134, B:62:0x013a, B:69:0x0171, B:36:0x0093, B:46:0x00be, B:59:0x0115), top: B:101:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171 A[Catch: SecurityException -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #7 {SecurityException -> 0x0097, blocks: (B:28:0x0067, B:60:0x0134, B:62:0x013a, B:69:0x0171, B:36:0x0093, B:46:0x00be, B:59:0x0115), top: B:101:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0 A[Catch: CancellationException -> 0x0043, TimeoutException -> 0x0046, ExecutionException -> 0x0049, InterruptedException -> 0x004c, TryCatch #8 {InterruptedException -> 0x004c, CancellationException -> 0x0043, ExecutionException -> 0x0049, TimeoutException -> 0x0046, blocks: (B:15:0x003c, B:77:0x01b1, B:79:0x01c0, B:80:0x01c3), top: B:108:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [faz] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [xdt] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00ff -> B:53:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x015a -> B:104:0x0160). Please report as a decompilation issue!!! */
    @Override // defpackage.fau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faz.a(agsw):java.lang.Object");
    }

    @Override // defpackage.fau
    public final Object b(MediaController mediaController, agsw agswVar) {
        PlaybackStateCompat playbackStateCompatA = mediaController.getPlaybackState() == null ? null : PlaybackStateCompat.a(mediaController.getPlaybackState());
        String packageName = mediaController.getPackageName();
        packageName.getClass();
        return d(packageName, playbackStateCompatA, mediaController.getMetadata(), agswVar);
    }

    @Override // defpackage.fau
    public final Object c(goc gocVar, agsw agswVar) {
        return d(gocVar.a, PlaybackStateCompat.a(gocVar.b), gocVar.c, agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r12, android.support.v4.media.session.PlaybackStateCompat r13, android.media.MediaMetadata r14, defpackage.agsw r15) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faz.d(java.lang.String, android.support.v4.media.session.PlaybackStateCompat, android.media.MediaMetadata, agsw):java.lang.Object");
    }
}
