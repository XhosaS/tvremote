package defpackage;

import com.google.android.apps.play.movies.common.service.room.PlayMoviesRoomDatabase;
import java.util.Set;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmr implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public lmr(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new kwy((yfo) this.a, (byte[]) null);
            case 1:
                return new kwy((mem) this.a.b(), (byte[]) null);
            case 2:
                gev gevVarD = gez.d(((rgq) this.a).a(), PlayMoviesRoomDatabase.class, "play_movies_room_db");
                gevVarD.c();
                PlayMoviesRoomDatabase playMoviesRoomDatabase = (PlayMoviesRoomDatabase) gevVarD.a();
                playMoviesRoomDatabase.getClass();
                return playMoviesRoomDatabase;
            case 3:
                PlayMoviesRoomDatabase playMoviesRoomDatabase2 = (PlayMoviesRoomDatabase) this.a.b();
                playMoviesRoomDatabase2.getClass();
                lor lorVarY = playMoviesRoomDatabase2.y();
                lorVarY.getClass();
                return lorVarY;
            case 4:
                return kgu.s((lfn) this.a.b());
            case 5:
                vbo vboVarU = kgu.u(((rgq) this.a).a());
                vboVarU.getClass();
                return vboVarU;
            case 6:
                return kgu.s((lfn) this.a.b());
            case 7:
                return kgu.s((lfn) this.a.b());
            case 8:
                return new lpb(((rgq) this.a).a());
            case 9:
                return kgu.s((lfn) this.a.b());
            case 10:
                return kgu.s((lfn) this.a.b());
            case 11:
                return kgu.s((lfn) this.a.b());
            case 12:
                return new uqj(this.a);
            case 13:
                return kgu.s((lfn) this.a.b());
            case 14:
                return kgu.s((lfn) this.a.b());
            case 15:
                ExperimentalCronetEngine experimentalCronetEngineBuild = new ExperimentalCronetEngine.Builder(((rgq) this.a).a()).build();
                experimentalCronetEngineBuild.getClass();
                if (rmx.b == null) {
                    synchronized (rmx.a) {
                        if (rmx.b == null) {
                            rmx.b = new rmx();
                        }
                    }
                }
                rmx rmxVar = rmx.b;
                if (rmr.a().h()) {
                    synchronized (rmxVar.c) {
                        Set set = rmxVar.d;
                        if (set.contains(experimentalCronetEngineBuild)) {
                            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 88, "PrimesCronetExtension.java")).s("Network monitoring is already started for the specified CronetEngine object, startNetworkMonitor() call is ignored");
                        } else if (set.isEmpty()) {
                            set.add(experimentalCronetEngineBuild);
                            experimentalCronetEngineBuild.addRequestFinishedListener(new rto(rmr.a().a.b().get()));
                        } else {
                            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 94, "PrimesCronetExtension.java")).s("Only 1 CronetEngine monitoring is supported, startNetworkMonitor() call is ignored");
                        }
                    }
                } else {
                    ((tug) ((tug) rnb.a.e()).j("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 75, "PrimesCronetExtension.java")).s("Network metric disabled. Skip initializing network monitor.");
                }
                experimentalCronetEngineBuild.getClass();
                return experimentalCronetEngineBuild;
            case 16:
                return new hfx((ksz) this.a.b(), (byte[]) null);
            case 17:
                return new hfx((ksz) this.a.b(), (byte[]) null);
            case 18:
                return new kdh((ksz) this.a.b());
            case 19:
                return new kdh((ksz) this.a.b());
            default:
                return new kdh((ksz) this.a.b());
        }
    }
}
