package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.collect.ImmutableSortedMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tmf {
    INPUT(2),
    IME(4),
    VOICE(8),
    PTT_ASSISTANT(16),
    POWER(32),
    VOLUME(64),
    AUDIO_DEVICES(1024),
    APP_LINK(512),
    FIND_MY_REMOTE(RecyclerView.ItemAnimator.FLAG_MOVED);

    public static final ImmutableSortedMap j;
    public final int k;

    static {
        ImmutableSortedMap.Builder builderNaturalOrder = ImmutableSortedMap.naturalOrder();
        for (tmf tmfVar : values()) {
            int i = tmfVar.k;
            if (i == 0) {
                throw null;
            }
            builderNaturalOrder.put((ImmutableSortedMap.Builder) Integer.valueOf(i), (Integer) tmfVar);
        }
        j = builderNaturalOrder.buildOrThrow();
    }

    tmf(int i) {
        this.k = i;
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((tmf) it.next()).k;
            if (i2 == 0) {
                throw null;
            }
            i |= i2;
        }
        return i;
    }
}
