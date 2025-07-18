package defpackage;

import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import com.google.common.collect.Sets;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnz {
    public final MediaSessionManager a;
    public final vrm b;
    public final ConcurrentHashMap c;
    public final Set d;
    public final MediaSessionManager.OnActiveSessionsChangedListener e;

    public gnz(MediaSessionManager mediaSessionManager, vrm vrmVar) {
        vrmVar.getClass();
        this.a = mediaSessionManager;
        this.b = vrmVar;
        this.c = new ConcurrentHashMap();
        Set setF = Sets.f();
        setF.getClass();
        this.d = setF;
        this.e = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: gnw
            @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
            public final void onActiveSessionsChanged(List list) {
                gnz gnzVar = this.a;
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MediaController mediaController = (MediaController) it.next();
                        mediaController.getClass();
                        ConcurrentHashMap concurrentHashMap = gnzVar.c;
                        if (!concurrentHashMap.containsKey(mediaController)) {
                            for (Object obj : gnzVar.d) {
                                obj.getClass();
                                ((gnx) obj).b(mediaController);
                            }
                            concurrentHashMap.put(mediaController, 0);
                        }
                        gnzVar.a(mediaController);
                    }
                    return;
                }
                ConcurrentHashMap concurrentHashMap2 = gnzVar.c;
                for (Object obj2 : concurrentHashMap2.keySet()) {
                    obj2.getClass();
                    MediaController mediaController2 = (MediaController) obj2;
                    gnzVar.a(mediaController2);
                    PlaybackState playbackState = mediaController2.getPlaybackState();
                    if (playbackState == null || playbackState.getState() == 0) {
                        for (Object obj3 : gnzVar.d) {
                            obj3.getClass();
                            ((gnx) obj3).c(mediaController2);
                        }
                        concurrentHashMap2.remove(mediaController2);
                    }
                }
            }
        };
    }

    public final void a(MediaController mediaController) {
        PlaybackState playbackState = mediaController.getPlaybackState();
        int state = playbackState != null ? playbackState.getState() : 0;
        ConcurrentHashMap concurrentHashMap = this.c;
        Integer num = (Integer) concurrentHashMap.get(mediaController);
        if (num != null && state == num.intValue()) {
            return;
        }
        for (Object obj : this.d) {
            obj.getClass();
            ((gnx) obj).d(mediaController, state);
        }
        concurrentHashMap.put(mediaController, Integer.valueOf(state));
    }

    public final void b(gnx gnxVar) {
        this.d.add(gnxVar);
    }
}
