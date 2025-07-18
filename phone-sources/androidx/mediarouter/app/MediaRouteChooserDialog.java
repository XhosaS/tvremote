package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.content.res.AppCompatResources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.fur;
import defpackage.fus;
import defpackage.fux;
import defpackage.fuy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteChooserDialog extends AppCompatDialog {
    public final fuy a;
    public final MediaRouterCallback b;
    public ArrayList c;
    public final Handler d;
    private fur e;
    private TextView f;
    private TextView g;
    private RelativeLayout h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private Button l;
    private ProgressBar m;
    private ListView n;
    private RouteAdapter o;
    private ScreenOnOffReceiver p;
    private boolean q;
    private long r;

    /* compiled from: PG */
    final class MediaRouterCallback extends fus {
        public MediaRouterCallback() {
        }

        @Override // defpackage.fus
        public void onRouteAdded(fuy fuyVar, fux fuxVar) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        @Override // defpackage.fus
        public void onRouteChanged(fuy fuyVar, fux fuxVar) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        @Override // defpackage.fus
        public void onRouteRemoved(fuy fuyVar, fux fuxVar) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        @Override // defpackage.fus
        public void onRouteSelected(fuy fuyVar, fux fuxVar) {
            MediaRouteChooserDialog.this.dismiss();
        }
    }

    /* compiled from: PG */
    final class RouteAdapter extends ArrayAdapter<fux> implements AdapterView.OnItemClickListener {
        private final LayoutInflater a;
        private final Drawable b;
        private final Drawable c;
        private final Drawable d;
        private final Drawable e;

        public RouteAdapter(Context context, List<fux> list) {
            super(context, 0, list);
            this.a = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.b = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
            this.c = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            this.d = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            this.e = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            /*
                r6 = this;
                r0 = 0
                if (r8 != 0) goto Lc
                android.view.LayoutInflater r8 = r6.a
                r1 = 2131624972(0x7f0e040c, float:1.8877139E38)
                android.view.View r8 = r8.inflate(r1, r9, r0)
            Lc:
                java.lang.Object r7 = r6.getItem(r7)
                fux r7 = (defpackage.fux) r7
                r9 = 2131429058(0x7f0b06c2, float:1.8479778E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r1 = 2131429056(0x7f0b06c0, float:1.8479774E38)
                android.view.View r1 = r8.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r2 = r7.e
                r9.setText(r2)
                java.lang.String r2 = r7.f
                int r3 = r7.i
                r4 = 1
                r5 = 2
                if (r3 == r5) goto L33
                if (r3 != r4) goto L45
            L33:
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L45
                r3 = 80
                r9.setGravity(r3)
                r1.setVisibility(r0)
                r1.setText(r2)
                goto L54
            L45:
                r0 = 16
                r9.setGravity(r0)
                r9 = 8
                r1.setVisibility(r9)
                java.lang.String r9 = ""
                r1.setText(r9)
            L54:
                boolean r9 = r7.h
                r8.setEnabled(r9)
                r9 = 2131429057(0x7f0b06c1, float:1.8479776E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                if (r9 == 0) goto La9
                android.net.Uri r0 = r7.g
                if (r0 == 0) goto L8f
                android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L7c
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L7c
                java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L7c
                r2 = 0
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L7c
                if (r0 == 0) goto L8f
                goto La6
            L7c:
                r1 = move-exception
                java.util.Objects.toString(r0)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "Failed to load "
                java.lang.String r0 = r2.concat(r0)
                java.lang.String r2 = "MediaRouteChooserDialog"
                android.util.Log.w(r2, r0, r1)
            L8f:
                int r0 = r7.m
                if (r0 == r4) goto La4
                if (r0 == r5) goto La1
                boolean r7 = r7.r()
                if (r7 == 0) goto L9e
                android.graphics.drawable.Drawable r0 = r6.e
                goto La6
            L9e:
                android.graphics.drawable.Drawable r0 = r6.b
                goto La6
            La1:
                android.graphics.drawable.Drawable r0 = r6.d
                goto La6
            La4:
                android.graphics.drawable.Drawable r0 = r6.c
            La6:
                r9.setImageDrawable(r0)
            La9:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteChooserDialog.RouteAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return getItem(i).h;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            fux item = getItem(i);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            item.n();
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

    /* compiled from: PG */
    final class ScreenOnOffReceiver extends BroadcastReceiver {
        public ScreenOnOffReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                MediaRouteChooserDialog.this.dismiss();
            }
        }
    }

    public MediaRouteChooserDialog(Context context) {
        this(context, 0);
    }

    final void a(List list) {
        this.r = SystemClock.uptimeMillis();
        this.c.clear();
        this.c.addAll(list);
        this.o.notifyDataSetChanged();
        Handler handler = this.d;
        handler.removeMessages(3);
        handler.removeMessages(2);
        if (!list.isEmpty()) {
            c(1);
        } else {
            c(0);
            handler.sendMessageDelayed(handler.obtainMessage(2), 5000L);
        }
    }

    final void b() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidth(getContext()), -2);
    }

    final void c(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.n.setVisibility(8);
            this.g.setVisibility(0);
            this.m.setVisibility(0);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.j.setVisibility(8);
            this.h.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.n.setVisibility(0);
            this.g.setVisibility(8);
            this.m.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.j.setVisibility(8);
            this.h.setVisibility(8);
            return;
        }
        if (i != 2) {
            setTitle(R.string.mr_chooser_zero_routes_found_title);
            this.n.setVisibility(8);
            this.g.setVisibility(8);
            this.m.setVisibility(8);
            this.k.setVisibility(0);
            this.l.setVisibility(0);
            this.j.setVisibility(0);
            this.h.setVisibility(0);
            return;
        }
        setTitle(R.string.mr_chooser_title);
        this.n.setVisibility(8);
        this.g.setVisibility(8);
        this.m.setVisibility(0);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.j.setVisibility(4);
        this.h.setVisibility(0);
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            getContext().unregisterReceiver(this.p);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public fur getRouteSelector() {
        return this.e;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
        this.a.d(this.e, this.b, 1);
        refreshRoutes();
        Handler handler = this.d;
        handler.removeMessages(2);
        handler.removeMessages(3);
        handler.removeMessages(1);
        handler.sendMessageDelayed(handler.obtainMessage(2), 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteChooserDialog.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.q = false;
        this.a.f(this.b);
        Handler handler = this.d;
        handler.removeMessages(1);
        handler.removeMessages(2);
        handler.removeMessages(3);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(fux fuxVar) {
        return !fuxVar.q() && fuxVar.h && fuxVar.u(this.e);
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
        if (this.q) {
            ArrayList arrayList = new ArrayList(fuy.m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, RouteComparator.sInstance);
            if (SystemClock.uptimeMillis() - this.r >= 300) {
                a(arrayList);
                return;
            }
            Handler handler = this.d;
            handler.removeMessages(1);
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.r + 300);
        }
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.e.equals(furVar)) {
            return;
        }
        this.e = furVar;
        if (this.q) {
            fuy fuyVar = this.a;
            MediaRouterCallback mediaRouterCallback = this.b;
            fuyVar.f(mediaRouterCallback);
            fuyVar.d(furVar, mediaRouterCallback, 1);
        }
        refreshRoutes();
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(int i) {
        this.f.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaRouteChooserDialog(Context context, int i) {
        Context contextG = MediaRouterThemeHelper.g(context, i, false);
        super(contextG, MediaRouterThemeHelper.b(contextG));
        this.e = fur.a;
        this.d = new Handler() { // from class: androidx.mediarouter.app.MediaRouteChooserDialog.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    MediaRouteChooserDialog.this.a((List) message.obj);
                    return;
                }
                if (i2 == 2) {
                    MediaRouteChooserDialog mediaRouteChooserDialog = MediaRouteChooserDialog.this;
                    if (mediaRouteChooserDialog.c.isEmpty()) {
                        mediaRouteChooserDialog.c(2);
                        Handler handler = mediaRouteChooserDialog.d;
                        handler.removeMessages(2);
                        handler.removeMessages(3);
                        handler.sendMessageDelayed(handler.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                MediaRouteChooserDialog mediaRouteChooserDialog2 = MediaRouteChooserDialog.this;
                if (mediaRouteChooserDialog2.c.isEmpty()) {
                    mediaRouteChooserDialog2.c(3);
                    Handler handler2 = mediaRouteChooserDialog2.d;
                    handler2.removeMessages(2);
                    handler2.removeMessages(3);
                    handler2.removeMessages(1);
                    mediaRouteChooserDialog2.a.f(mediaRouteChooserDialog2.b);
                }
            }
        };
        this.a = fuy.b(getContext());
        this.b = new MediaRouterCallback();
        this.p = new ScreenOnOffReceiver();
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }
}
