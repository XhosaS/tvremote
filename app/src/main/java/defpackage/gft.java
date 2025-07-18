package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gft implements gfr {
    private final fed a;

    public gft(feh fehVar) {
        ComponentName componentName = irm.a;
        String className = irm.o.getClassName();
        className.getClass();
        this.a = fehVar.a(className);
    }

    @Override // defpackage.gfr
    public final void a(rqs rqsVar, abqb abqbVar, Duration duration, ahrs ahrsVar) {
        int iA;
        abqbVar.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 35;
        Bundle bundle = new Bundle();
        bundle.putString("AppflowEventKey", ((rqt) rqsVar).a.b);
        bundle.putInt("AppflowEventStatusCode", abqbVar.s);
        if (duration != null) {
            bundle.putLong("AppflowElapsedTime", duration.toNanos());
        }
        if (ahrsVar != null) {
            try {
                int i = ahrsVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(ahrsVar.getClass()).a(ahrsVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(ahrsVar.getClass()).a(ahrsVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        ahrsVar.memoizedSerializedSize = (Integer.MIN_VALUE & ahrsVar.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(ahrsVar.getClass()).m(ahrsVar, abwa.a(abvwVar));
                abvwVar.K();
                bundle.putByteArray("AppflowEventOpaTvExtension", bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.x(ahrsVar, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
            }
        }
        fed fedVar = this.a;
        messageObtain.setData(bundle);
        fedVar.a(messageObtain);
    }

    @Override // defpackage.gfr
    public final void b(rqs rqsVar, Duration duration, ahrs ahrsVar) {
        int iA;
        Message messageObtain = Message.obtain();
        messageObtain.what = 50;
        Bundle bundle = new Bundle();
        bundle.putString("AppflowEventKey", ((rqt) rqsVar).a.b);
        if (duration != null) {
            bundle.putLong("AppflowElapsedTime", duration.toNanos());
        }
        if (ahrsVar != null) {
            try {
                int i = ahrsVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(ahrsVar.getClass()).a(ahrsVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(ahrsVar.getClass()).a(ahrsVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        ahrsVar.memoizedSerializedSize = (Integer.MIN_VALUE & ahrsVar.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(ahrsVar.getClass()).m(ahrsVar, abwa.a(abvwVar));
                abvwVar.K();
                bundle.putByteArray("AppflowEventOpaTvExtension", bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.x(ahrsVar, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
            }
        }
        fed fedVar = this.a;
        messageObtain.setData(bundle);
        fedVar.a(messageObtain);
    }

    @Override // defpackage.gfr
    public final void c(rqw rqwVar, abqb abqbVar, Duration duration, ahrs ahrsVar) {
        int iA;
        abqbVar.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 51;
        Bundle bundle = new Bundle();
        if (rqwVar != null) {
            bundle.putString("AppflowEventKey", rqwVar.toString());
        }
        bundle.putInt("AppflowEventStatusCode", abqbVar.s);
        if (duration != null) {
            bundle.putLong("AppflowElapsedTime", duration.toNanos());
        }
        if (ahrsVar != null) {
            try {
                int i = ahrsVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(ahrsVar.getClass()).a(ahrsVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(ahrsVar.getClass()).a(ahrsVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        ahrsVar.memoizedSerializedSize = (Integer.MIN_VALUE & ahrsVar.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(ahrsVar.getClass()).m(ahrsVar, abwa.a(abvwVar));
                abvwVar.K();
                bundle.putByteArray("AppflowEventOpaTvExtension", bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.x(ahrsVar, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
            }
        }
        fed fedVar = this.a;
        messageObtain.setData(bundle);
        fedVar.a(messageObtain);
    }

    @Override // defpackage.gfr
    public final void d(rqs rqsVar, int i) {
        e(rqsVar, i, null);
    }

    @Override // defpackage.gfr
    public final void e(rqs rqsVar, int i, Duration duration) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 35;
        Bundle bundle = new Bundle();
        bundle.putString("AppflowEventKey", ((rqt) rqsVar).a.b);
        bundle.putInt("AppflowEventCustomStatusCode", ggj.a(i));
        if (duration != null) {
            bundle.putLong("AppflowElapsedTime", duration.toNanos());
        }
        fed fedVar = this.a;
        messageObtain.setData(bundle);
        fedVar.a(messageObtain);
    }

    @Override // defpackage.gfr
    public final void f(rqw rqwVar, int i) {
        g(rqwVar, i, null);
    }

    @Override // defpackage.gfr
    public final void g(rqw rqwVar, int i, Duration duration) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 51;
        Bundle bundle = new Bundle();
        if (rqwVar != null) {
            bundle.putString("AppflowEventKey", rqwVar.toString());
        }
        bundle.putInt("AppflowEventStatusCode", ggj.a(i));
        if (duration != null) {
            bundle.putLong("AppflowElapsedTime", duration.toNanos());
        }
        fed fedVar = this.a;
        messageObtain.setData(bundle);
        fedVar.a(messageObtain);
    }
}
