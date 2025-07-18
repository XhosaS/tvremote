package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.fur;
import defpackage.fus;
import defpackage.fux;
import defpackage.fuy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteDynamicChooserDialog extends AppCompatDialog {
    final fuy a;
    Context b;
    List c;
    fux d;
    private final MediaRouterCallback e;
    private fur f;
    private ImageButton g;
    private RecyclerAdapter h;
    private RecyclerView i;
    private boolean j;
    private long k;
    private long l;
    private final Handler m;

    /* compiled from: PG */
    final class MediaRouterCallback extends fus {
        public MediaRouterCallback() {
        }

        @Override // defpackage.fus
        public void onRouteAdded(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicChooserDialog.this.refreshRoutes();
        }

        @Override // defpackage.fus
        public void onRouteChanged(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicChooserDialog.this.refreshRoutes();
        }

        @Override // defpackage.fus
        public void onRouteRemoved(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicChooserDialog.this.refreshRoutes();
        }

        @Override // defpackage.fus
        public void onRouteSelected(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicChooserDialog.this.dismiss();
        }
    }

    /* compiled from: PG */
    final class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        public final Drawable a;
        public final Drawable b;
        public final Drawable c;
        public final Drawable d;
        private final ArrayList f = new ArrayList();
        private final LayoutInflater g;

        /* compiled from: PG */
        class HeaderViewHolder extends RecyclerView.ViewHolder {
            final TextView a;

            public HeaderViewHolder(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.mr_picker_header_name);
            }

            public void bindHeaderView(Item item) {
                this.a.setText(item.getData().toString());
            }
        }

        /* compiled from: PG */
        class Item {
            private final Object a;
            private final int b;

            public Item(Object obj) {
                int i;
                this.a = obj;
                if (obj instanceof String) {
                    i = 1;
                } else {
                    if (!(obj instanceof fux)) {
                        throw new IllegalArgumentException();
                    }
                    i = 2;
                }
                this.b = i;
            }

            public Object getData() {
                return this.a;
            }

            public int getType() {
                return this.b;
            }
        }

        /* compiled from: PG */
        class RouteViewHolder extends RecyclerView.ViewHolder {
            final View a;
            final ImageView b;
            final ProgressBar c;
            final TextView d;

            public RouteViewHolder(View view) {
                super(view);
                this.a = view;
                this.b = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.c = progressBar;
                this.d = (TextView) view.findViewById(R.id.mr_picker_route_name);
                MediaRouterThemeHelper.n(MediaRouteDynamicChooserDialog.this.b, progressBar);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void bindRouteView(androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.Item r5) {
                /*
                    r4 = this;
                    java.lang.Object r5 = r5.getData()
                    fux r5 = (defpackage.fux) r5
                    android.view.View r0 = r4.a
                    r1 = 0
                    r0.setVisibility(r1)
                    android.widget.ProgressBar r1 = r4.c
                    r2 = 4
                    r1.setVisibility(r2)
                    androidx.mediarouter.app.MediaRouteDynamicChooserDialog$RecyclerAdapter$RouteViewHolder$1 r1 = new androidx.mediarouter.app.MediaRouteDynamicChooserDialog$RecyclerAdapter$RouteViewHolder$1
                    r1.<init>()
                    r0.setOnClickListener(r1)
                    java.lang.String r0 = r5.e
                    android.widget.TextView r1 = r4.d
                    r1.setText(r0)
                    android.net.Uri r0 = r5.g
                    androidx.mediarouter.app.MediaRouteDynamicChooserDialog$RecyclerAdapter r1 = androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.this
                    if (r0 == 0) goto L4e
                    androidx.mediarouter.app.MediaRouteDynamicChooserDialog r2 = androidx.mediarouter.app.MediaRouteDynamicChooserDialog.this     // Catch: java.io.IOException -> L3b
                    android.content.Context r2 = r2.b     // Catch: java.io.IOException -> L3b
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.io.IOException -> L3b
                    java.io.InputStream r2 = r2.openInputStream(r0)     // Catch: java.io.IOException -> L3b
                    r3 = 0
                    android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r2, r3)     // Catch: java.io.IOException -> L3b
                    if (r0 == 0) goto L4e
                    goto L67
                L3b:
                    r2 = move-exception
                    java.util.Objects.toString(r0)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r3 = "Failed to load "
                    java.lang.String r0 = r3.concat(r0)
                    java.lang.String r3 = "RecyclerAdapter"
                    android.util.Log.w(r3, r0, r2)
                L4e:
                    int r0 = r5.m
                    r2 = 1
                    if (r0 == r2) goto L65
                    r2 = 2
                    if (r0 == r2) goto L62
                    boolean r5 = r5.r()
                    if (r5 == 0) goto L5f
                    android.graphics.drawable.Drawable r0 = r1.d
                    goto L67
                L5f:
                    android.graphics.drawable.Drawable r0 = r1.a
                    goto L67
                L62:
                    android.graphics.drawable.Drawable r0 = r1.c
                    goto L67
                L65:
                    android.graphics.drawable.Drawable r0 = r1.b
                L67:
                    android.widget.ImageView r5 = r4.b
                    r5.setImageDrawable(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.RouteViewHolder.bindRouteView(androidx.mediarouter.app.MediaRouteDynamicChooserDialog$RecyclerAdapter$Item):void");
            }
        }

        public RecyclerAdapter() {
            this.g = LayoutInflater.from(MediaRouteDynamicChooserDialog.this.b);
            this.a = MediaRouterThemeHelper.h(MediaRouteDynamicChooserDialog.this.b);
            this.b = MediaRouterThemeHelper.l(MediaRouteDynamicChooserDialog.this.b);
            this.c = MediaRouterThemeHelper.j(MediaRouteDynamicChooserDialog.this.b);
            this.d = MediaRouterThemeHelper.k(MediaRouteDynamicChooserDialog.this.b);
            a();
        }

        final void a() {
            ArrayList arrayList = this.f;
            arrayList.clear();
            MediaRouteDynamicChooserDialog mediaRouteDynamicChooserDialog = MediaRouteDynamicChooserDialog.this;
            arrayList.add(new Item(mediaRouteDynamicChooserDialog.b.getString(R.string.mr_chooser_title)));
            Iterator it = mediaRouteDynamicChooserDialog.c.iterator();
            while (it.hasNext()) {
                arrayList.add(new Item((fux) it.next()));
            }
            notifyDataSetChanged();
        }

        public Item getItem(int i) {
            return (Item) this.f.get(i);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f.size();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return ((Item) this.f.get(i)).getType();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            Item item = getItem(i);
            if (itemViewType == 1) {
                ((HeaderViewHolder) viewHolder).bindHeaderView(item);
            } else if (itemViewType != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((RouteViewHolder) viewHolder).bindRouteView(item);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new HeaderViewHolder(this.g.inflate(R.layout.mr_picker_header_item, viewGroup, false));
            }
            if (i == 2) {
                return new RouteViewHolder(this.g.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: PG */
    final class RouteComparator implements Comparator<fux> {
        public static final RouteComparator sInstance = new RouteComparator();

        @Override // java.util.Comparator
        public int compare(fux fuxVar, fux fuxVar2) {
            return fuxVar.e.compareToIgnoreCase(fuxVar2.e);
        }
    }

    public MediaRouteDynamicChooserDialog(Context context) {
        this(context, 0);
    }

    final void a() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidthForDynamicGroup(this.b), MediaRouteDialogHelper.getDialogHeight(this.b));
    }

    final void b(List list) {
        this.l = SystemClock.uptimeMillis();
        this.c.clear();
        this.c.addAll(list);
        this.h.a();
    }

    public fur getRouteSelector() {
        return this.f;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
        this.a.d(this.f, this.e, 1);
        refreshRoutes();
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        MediaRouterThemeHelper.m(this.b, this);
        this.c = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_picker_close_button);
        this.g = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicChooserDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteDynamicChooserDialog.this.dismiss();
            }
        });
        this.h = new RecyclerAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.i = recyclerView;
        recyclerView.setAdapter(this.h);
        this.i.setLayoutManager(new LinearLayoutManager(this.b));
        a();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j = false;
        this.a.f(this.e);
        this.m.removeMessages(1);
    }

    public boolean onFilterRoute(fux fuxVar) {
        return !fuxVar.q() && fuxVar.h && fuxVar.u(this.f);
    }

    public void onFilterRoutes(List<fux> list) {
        int size = list.size();
        while (size > 0) {
            size--;
            if (!onFilterRoute(list.get(size))) {
                list.remove(size);
            }
        }
    }

    public void refreshRoutes() {
        if (this.d == null && this.j) {
            ArrayList arrayList = new ArrayList(fuy.m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, RouteComparator.sInstance);
            if (SystemClock.uptimeMillis() - this.l >= this.k) {
                b(arrayList);
                return;
            }
            Handler handler = this.m;
            handler.removeMessages(1);
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.l + this.k);
        }
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f.equals(furVar)) {
            return;
        }
        this.f = furVar;
        if (this.j) {
            fuy fuyVar = this.a;
            MediaRouterCallback mediaRouterCallback = this.e;
            fuyVar.f(mediaRouterCallback);
            fuyVar.d(furVar, mediaRouterCallback, 1);
        }
        refreshRoutes();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaRouteDynamicChooserDialog(Context context, int i) {
        Context contextG = MediaRouterThemeHelper.g(context, i, false);
        super(contextG, MediaRouterThemeHelper.b(contextG));
        this.f = fur.a;
        this.m = new Handler() { // from class: androidx.mediarouter.app.MediaRouteDynamicChooserDialog.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                MediaRouteDynamicChooserDialog.this.b((List) message.obj);
            }
        };
        Context context2 = getContext();
        this.a = fuy.b(context2);
        this.e = new MediaRouterCallback();
        this.b = context2;
        this.k = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }
}
