package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycm implements ybp {
    private final /* synthetic */ int a;

    public ycm(int i) {
        this.a = i;
    }

    @Override // defpackage.ybp
    public final /* synthetic */ Object a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.a == 0) {
            return Executors.newCachedThreadPool(xxc.i("grpc-okhttp-%d"));
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, xxc.i("grpc-timer-%d"));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, true);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.ybp
    public final /* synthetic */ void b(Object obj) {
        if (this.a != 0) {
            ((ScheduledExecutorService) obj).shutdown();
        } else {
            ((ExecutorService) obj).shutdown();
        }
    }
}
