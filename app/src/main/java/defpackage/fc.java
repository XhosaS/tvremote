package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.bwu;
import defpackage.bwy;
import defpackage.ew;
import defpackage.ez;
import defpackage.fb;
import defpackage.fc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fc implements fa {
    protected final MediaController a;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public fc(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                private final WeakReference a;

                {
                    super(null);
                    this.a = new WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                protected final void onReceiveResult(int i, Bundle bundle) {
                    ew ewVar;
                    fc fcVar = (fc) this.a.get();
                    if (fcVar == null || bundle == null) {
                        return;
                    }
                    synchronized (fcVar.b) {
                        MediaSessionCompat$Token mediaSessionCompat$Token2 = fcVar.e;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        if (binder == null) {
                            ewVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            ewVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ew)) ? new ew(binder) : (ew) iInterfaceQueryLocalInterface;
                        }
                        synchronized (mediaSessionCompat$Token2.a) {
                            mediaSessionCompat$Token2.c = ewVar;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token3 = fcVar.e;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(bwu.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (!(parcelable instanceof ParcelImpl)) {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                                bwy bwyVar = ((ParcelImpl) parcelable).a;
                            }
                        } catch (RuntimeException unused) {
                        }
                        synchronized (mediaSessionCompat$Token3.a) {
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token4 = fcVar.e;
                        if (mediaSessionCompat$Token4.a() != null) {
                            Iterator it = fcVar.c.iterator();
                            if (it.hasNext()) {
                                ez ezVar = (ez) it.next();
                                fb fbVar = new fb(ezVar);
                                fcVar.d.put(ezVar, fbVar);
                                ezVar.a = fbVar;
                                try {
                                    ew ewVarA = mediaSessionCompat$Token4.a();
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        parcelObtain.writeStrongInterface(fbVar);
                                        ewVarA.a.transact(3, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        throw null;
                                    } finally {
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    }
                                } catch (RemoteException e) {
                                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                                }
                            }
                            fcVar.c.clear();
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.fa
    public final fe a() {
        MediaController.TransportControls transportControls = this.a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new fi(transportControls) : new fh(transportControls);
    }
}
