package rizky.android.com.monitortank;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterTanki extends RecyclerView.Adapter<AdapterTanki.TankiViewHolder> {


    private ArrayList<Tanki> tankiArrayList;

    public AdapterTanki(ArrayList<Tanki> tankiArrayList) {
        this.tankiArrayList = tankiArrayList;
    }

    @Override
    public TankiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from (parent.getContext ());
        View view = layoutInflater.inflate (R.layout.list_tank, parent, false);
        return new TankiViewHolder (view);
    }

    @Override
    public void onBindViewHolder(TankiViewHolder holder, final int position) {

        holder.textViewLokasi.setText (tankiArrayList.get (position).getLokasi ());
        holder.imageView.setImageResource (tankiArrayList.get (position).getImage ());

        holder.itemView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

//                Toast.makeText (v.getContext (), "Item is Clicked " + position, Toast.LENGTH_SHORT).show ();

                if (position == 0){

                    Intent intent = new Intent (v.getContext (), DetailActivity.class);
                    v.getContext ().startActivity (intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
//        return (tankiArrayList != null) ? tankiArrayList.size () : 0;
        return tankiArrayList.size ();
    }

    public class TankiViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewLokasi;
        private ImageView imageView;

        public TankiViewHolder(View itemView) {
            super (itemView);
            textViewLokasi = (TextView)itemView.findViewById (R.id.textViewLokasi);
            imageView = (ImageView)itemView.findViewById (R.id.imageTanki);
//            itemView.setOnClickListener (new View.OnClickListener () {
//                @Override
//                public void onClick(View v) {
//
//                    Toast.makeText (v.getContext (), "Item is Clicked", Toast.LENGTH_SHORT).show ();
//                }
//            });
        }
    }
}
