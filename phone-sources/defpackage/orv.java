package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.BindViewHolder;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.bind.widget.BindingFrameLayout;
import com.google.android.videos.R;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orv extends RecyclerView.Adapter {
    private static final ory a = ory.a(orv.class);
    private final orx b = orx.c;

    public orv() {
        new CopyOnWriteArrayList();
        super.setHasStableIds(true);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return Long.MAX_VALUE;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return R.layout.bind__default_loading;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        View view = ((BindViewHolder) viewHolder).itemView;
        if (view == null) {
            throw new NullPointerException("Adapter received a null View during binding.");
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Exception {
        long j;
        orj orjVar = orj.b;
        boolean z = orj.a;
        boolean z2 = orj.a;
        org.a();
        ReentrantLock reentrantLock = orjVar.c;
        reentrantLock.lock();
        reentrantLock.unlock();
        orh orhVar = orjVar.e;
        long jUptimeMillis = SystemClock.uptimeMillis() + 75;
        Object obj = orhVar.a;
        try {
            synchronized (obj) {
                synchronized (obj) {
                    j = orhVar.c;
                }
                return new BindViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
            }
            return new BindViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        } catch (Exception e) {
            a.b("Unable to inflate view %s", Integer.toString(i));
            throw e;
        }
        if (j <= 0) {
            orhVar.a(jUptimeMillis);
        } else if (jUptimeMillis > orhVar.c) {
            orhVar.a(jUptimeMillis);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        BindViewHolder bindViewHolder = (BindViewHolder) viewHolder;
        View view = bindViewHolder.itemView;
        bindViewHolder.onRecycled();
        if (view instanceof BindingFrameLayout) {
            ((BindingFrameLayout) view).b();
        }
    }
}
